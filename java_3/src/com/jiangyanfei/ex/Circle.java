package com.jiangyanfei.ex;

public class Circle {

	private double radius;
	
	//���๹�췽��(������������������)
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

