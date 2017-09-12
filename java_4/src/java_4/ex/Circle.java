package java_4.ex;

public class Circle {
	private double radius;
	
	public Circle(double radius) {
		// TODO 自动生成的构造函数存根
		this.radius = radius;
	}
	
	public Circle() {
		// TODO 自动生成的构造函数存根
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double findArea(){
		return Math.PI*this.radius*this.radius;
	}
}
