package circle.ex;
/*
  	1.定义一个Circle类，描述Circle，包括半径、求圆的面积、周长
	定义一个测试类TestCircle，验证Circle类
	2. 编写一个圆类Circle，其中有圆周率，半径和圆对象个数，
	其中圆周率和圆对象个数为static成员，
	此外，Circle中还有两个static方法分别是
	设置圆周率和显示当前圆对象个数的，
	其余都是实例成员（设计性实验）。
 */
public class Circle {
	private double radius;
	private static double PI=3.14;  				//静态成员
	private static int cnt=0;
	
	public Circle(double radius){
		this.radius = radius;
		cnt++;
	}
	
	public static void setPI(double p) {			//静态设置圆周率方法
		PI = p;
	}
	
	public static int count(){
		return cnt;
	}
	
	public double getArea(){
		return PI*radius*radius;
	}
	
	public double getLength(){
		return 2*PI*radius;
	}
}
