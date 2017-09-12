package com.jiangyanfei.app.ex;
public class Passobject {

	public void PrintArea(Circle c , int time){
		System.out.println("radius\t\tarea");
		for(int i=1;i<=time;i++){
			c.setRadius(i);
			System.out.println(c.getRadius()+"\t\t"+c.findarea());
			
		}
	}
	
	public static void main(String[] args) {
		Passobject p = new Passobject();
		Circle c = new Circle();
		p.PrintArea(c, 10);
		
	}
}
