package test4;

public  class Salesman extends Employee{
	private double basicsalery;
	private double commission;
	
	public Salesman(String name, int age,double basicsalery,double commission) {
		super(name, age);
		this.basicsalery = basicsalery;
		this.commission = commission;
	}

	public double Wages() {
		return basicsalery*(1+commission);
	}
}
