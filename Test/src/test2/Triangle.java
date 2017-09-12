package test2;

public class Triangle extends Shape{
	private double bottom;
	private double highly;
	
	public Triangle(double bottom,double highly) {
		this.bottom = bottom;
		this.highly = highly;
	}
	
	public double getArea() {
		return 0.5*bottom*highly;
	}
	
}
