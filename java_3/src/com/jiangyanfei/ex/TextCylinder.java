package com.jiangyanfei.ex;

public class TextCylinder {

	public static void main(String[] args) {
		Cylinder cy = new Cylinder(2,2);
		Circle   ci = new Circle(2);
		ci.setRadius(2);
		System.out.println("CircleRadius:"+ci.getRadius());
		ci.findArea();
		System.out.println("CircleArea:"+ci.findArea());
		cy.setRadius(2);
		cy.setLength(2);
		cy.findArea();
		System.out.println("CylinderSurfaceArea:"+cy.findArea());
		System.out.println("CylinderVolume:"+cy.findVolume());
		
	}
	
	
}
