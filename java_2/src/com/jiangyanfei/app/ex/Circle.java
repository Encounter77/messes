package com.jiangyanfei.app.ex;

public class Circle {
	private double radius;
	//��radius��ֵ
	public void setRadius(double radius) {
		this.radius = radius;
	}
	//�õ�radius��ֵ
	public double getRadius() {
		return radius;
	}
	
	public double findarea(){
		return 3.14*radius*radius;
	}
}
