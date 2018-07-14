package com.xebia.yakshop;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "herd")
@XmlAccessorType(XmlAccessType.FIELD)
public class Herd {

	@XmlElement(name = "labyak")
	private List<Yak> yaks;

	public List<Yak> getYaks() {
		return yaks;
	}

	public void setYaks(List<Yak> yaks) {
		this.yaks = yaks;
	}

	public double getMilkYield(int elapsedDays) {
		double yield = 0;
		for (Yak yak : yaks) {
			yield += new MilkYieldCalculator(elapsedDays, yak).calculate();
		}
		return yield;
	}

	public double getWoolSkinCount(int elapsedDays){
		double yield = 0;
		for (Yak yak : yaks) {
			yield += new WoolYieldCalculator(elapsedDays, yak).calculate();
		}
		return yield;

	}
	
	public void getYakAge(int elapsedDays){
		double yakAge = 0;
		for (Yak yak : yaks) {
			yakAge = new YakAgeCalculator(elapsedDays, yak).calculate();
			System.out.println(yak.getName() +" "+ yakAge +"years old");
		}

	}
	
}
