package test4;

public class Worker extends Employee{
	private double days;
	private double wages;
	
	public Worker(String name, int age,double days,double wages) {
		super(name, age);
		this.days = days;
		this.wages = wages;
	}

	public double Wages() {
		return days*wages;
	}
}
