package com.xebia.yakshop;

public class WoolYieldCalculator {

	private int elapsedDays;
	private Yak yak;

	public WoolYieldCalculator(int elapsedDays, Yak yak) {
		this.elapsedDays = elapsedDays;
		this.yak = yak;
	}
	
	public double calculate() {
		double ageInDaysTillElapsed = yak.getAge() * 100 + elapsedDays - 1;
		double ageInDays = yak.getAge() * 100;
		double y = 0;
		for (double i = ageInDays; i <= ageInDaysTillElapsed; i=i+(8 + i*0.01)) {
			y=y+1;
		}
		//System.out.println(y);
		return y;
	}
	
}
