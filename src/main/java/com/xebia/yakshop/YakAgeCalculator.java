package com.xebia.yakshop;

public class YakAgeCalculator {

	private int elapsedDays;
	private Yak yak;

	public YakAgeCalculator(int elapsedDays, Yak yak) {
		this.elapsedDays = elapsedDays;
		this.yak = yak;
	}

	public double calculate() {
		return yak.getAge() * 100 + elapsedDays;
	}

}
