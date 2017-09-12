package com.jiangyanfei.ex;

public class Circle {

	private double radius;
	
	//父类构造方法(含参数，子类必须调用)
	public  Circle(double radius){
		this.radius=radius;
	}	
	
	public void setRadius(double radius){
		this.radius=radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public double findArea(){
		return 3.14*radius*radius;
	}
}

