package com.jiangyanfei.ex;

public class Cylinder extends Circle{
	private double length;
	//�����Ĭ�Ϲ�����
	//public Cylinder() {
	//		super();
	//}
	public Cylinder(double radius,double length){
		//������ø��ຬ�������췽��
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
	//��д���෽��������super���ø��෽��������Բ���ı������
	public double findArea() {
		return super.findArea()*2+getRadius()*2*3.14*length;
	}
	
	public double findVolume(){
		return super.findArea()*length;
	}
}
