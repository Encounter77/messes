package com.jiangyanfei.app;
/*
 * 信息的封装和隐藏
 * 1.把属性隐藏起来，用private关键字。
 * 2.利用public的 setXXX、getXXX方法来访问属性。
 * 
 * */
public class Circle {
	//默认构造器
	/*1.构造器和类同名，且没有返回值。(void也不能写)
	 *2.JVM会为每一个类创建一个默认的无参数的构造方法(器)。
	 *3.构造器的作用:为类的属性进行初始化。
	 */
	  /* public Circle(){
	 			radius = 10;
	  		}*/
	
	//隐藏radius属性
	private int radius;
	//创建访问方法1.为属性赋值的set方法
	public void setRadius(int r){
		if(r<0){
			System.out.println("错误赋值:Radius="+r+" 默认赋值:Radius="+radius);
			return;
		}
		radius=r;
	} 
	//2.读取属性值的get方法
	public int getRadius(){
		return radius;
	}
	//计算面积的circlearea方法
	public double circlearea(){
		return 3.14*radius*radius;
	}
}
