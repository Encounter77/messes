package test.ex2;

public class Test {
	public static void main(String[] args) {
		Shape s1 = new Circle(2);
		Shape s2 = new Square(2, 3);

		System.out.println("圆的周长:" + s1.girth());
		System.out.println("圆的面积:" + s1.area());
		System.out.println("矩形的周长:" + s2.girth());
		System.out.println("矩形的面积:" + s2.area());
	}
}
