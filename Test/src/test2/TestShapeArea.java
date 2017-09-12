package test2;

public class TestShapeArea {
	public static void main(String[] args) {
		Shape s1 = new Circle(1);
		Shape s2 = new Rectangle(6,2);
		Shape s3 = new Triangle(5,2);
		Shape s4 = new Trapezoidal(2,5,3);
		
		//System.out.println(s1.getArea());
		//System.out.println(s2.getArea());
		//System.out.println(s3.getArea());
		//System.out.println(s4.getArea());
		
		System.out.println(s1.CompareArea(s1.getArea(),s2.getArea()));
		System.out.println(s2.CompareArea(s2.getArea(),s3.getArea()));
		System.out.println(s3.CompareArea(s3.getArea(),s4.getArea()));
	}
}
