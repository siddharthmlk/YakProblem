package com.xebia.yakshop;

public class MilkYieldCalculator {

	private int elapsedDays;
	private Yak yak;

	public MilkYieldCalculator(int elapsedDays, Yak yak) {
		this.elapsedDays = elapsedDays;
		this.yak = yak;
	}

	public double calculate() {
		double ageInDaysTillElapsed = yak.getAge() * 100 + elapsedDays - 1;
		double ageInDays = yak.getAge() * 100;
		double y = 0;
		for (double i = ageInDays; i <= ageInDaysTillElapsed; i++) {
			y += 50 - i * 0.03;
		}
		return y;
	}

}
