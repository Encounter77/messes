package test.ex2;

public class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public double girth() {
		return 2 * 3.14 * this.radius;
	}

	@Override
	public double area() {
		return this.radius * this.radius * 3.14;
	}
	
}
