package test2;

public class Trapezoidal extends Shape{
	private double onbottom;
	private double bottom;
	private double highly;
	
	public Trapezoidal(double onbottom,double bottom,double highly) {
		this.bottom = bottom;
		this.onbottom = onbottom;
		this.highly = highly;
	}
	
	public double getArea() {
		return (bottom+onbottom)*highly*0.5;
	}
	
}
