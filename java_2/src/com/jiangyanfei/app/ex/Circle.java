package com.jiangyanfei.app.ex;

public class Circle {
	private double radius;
	//给radius赋值
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//得到radius的值
	public double getRadius() {
		return radius;
	}
	
	public double findarea(){
		return 3.14*radius*radius;
	}
}
