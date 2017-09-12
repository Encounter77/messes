package com.jiangyanfei.ex;

public class Cylinder extends Circle{
	private double length;
	//子类的默认构造器
	//public Cylinder() {
	//		super();
	//}
	public Cylinder(double radius,double length){
		//子类调用父类含参数构造方法
		super(radius);
		//super.setRadius(radius);
		this.length=length;
	}
	
	public void setLength(double length){
		this.length=length;
	}
	public double getLength(){
		return length;
	}
	//public Cylinder(double length) {
	//	super();
	//	this.length = length;
	//}
	@Override
	//重写父类方法，并用super调用父类方法，计算圆柱的表面积。
	public double findArea() {
		return super.findArea()*2+getRadius()*2*3.14*length;
	}
	
	public double findVolume(){
		return super.findArea()*length;
	}
}
