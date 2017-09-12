package test.ex1;

public class Calculator {
	private double count1;
	private double count2;

	public Calculator() {

	}

	public Calculator(double count1, double count2) {
		this.count1 = count1;
		this.count2 = count2;
	}

	public double add() {
		return this.count1 + this.count2;
	}

	public double minus() {
		return this.count1 - this.count2;
	}

	public double multiply() {
		return this.count1 * this.count2;
	}

	public double divide() {
		return this.count1 / this.count2;
	}

	public double getCount1() {
		return count1;
	}

	public void setCount1(double count1) {
		this.count1 = count1;
	}

	public double getCount2() {
		return count2;
	}

	public void setCount2(double count2) {
		this.count2 = count2;
	}
}