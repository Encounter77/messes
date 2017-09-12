package test.ex2;

public class Square extends Shape {
	private double length;
	private double width;

	public Square(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double girth() {
		return (this.length + this.width) * 2;
	}

	@Override
	public double area() {
		return this.length * this.width;
	}

}