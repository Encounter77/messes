package java_4.ex;

public class Circle {
	private double radius;
	
	public Circle(double radius) {
		// TODO �Զ����ɵĹ��캯�����
		this.radius = radius;
	}
	
	public Circle() {
		// TODO �Զ����ɵĹ��캯�����
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
