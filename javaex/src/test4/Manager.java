package test4;

public class Manager extends Employee{
	private double fixedwages;
	
	public Manager(String name, int age,double fixedwages) {
		super(name,age);
		this.fixedwages = fixedwages;
	}

	public double Wages() {
		return fixedwages;
	}	
}
