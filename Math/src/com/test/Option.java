package com.test;

public class Option {
	public String appearanceScore;
	public String hobbyScore;
	public String characterScore;

	public Option() {
		// TODO Auto-generated constructor stub
		this.appearanceScore = null;
		this.hobbyScore = null;
		this.characterScore = null;
	}

	public double resultScore() {
		double quantify1 = 0;
		double quantify2 = 0;
		double quantify3 = 0;
		double sum = 0;
		if (this.appearanceScore.equals("A")) {
			quantify1 = 1;
		} else if (this.appearanceScore.equals("B")) {
			quantify1 = 0.9;
		} else if (this.appearanceScore.equals("C")) {
			quantify1 = 0.8;
		} else {
			quantify1 = 0.5;
		}

		if (this.hobbyScore.equals("A")) {
			quantify2 = 1;
		} else if (this.hobbyScore.equals("B")) {
			quantify2 = 0.9;
		} else if (this.hobbyScore.equals("C")) {
			quantify2 = 0.8;
		} else {
			quantify2 = 0.5;
		}
		if (this.characterScore.equals("A")) {
			quantify3 = 1;
		} else if (this.characterScore.equals("B")) {
			quantify3 = 0.9;
		} else if (this.characterScore.equals("C")) {
			quantify3 = 0.8;
		} else {
			quantify3 = 0.5;
		}
		sum = quantify1 * 0.3 + quantify2 * 0.3 + quantify3 * 0.4;
		return sum;
	}

	public boolean bestOption(double s, double d, double r) {
		if (s >= (d/10 - r)) {
			return true;
		}
		return false;
	}
}
