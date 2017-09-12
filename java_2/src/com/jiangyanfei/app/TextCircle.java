package com.jiangyanfei.app;
import java.util.Scanner;
public class TextCircle {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//创建Circle类的对象c，一定是调用了类Circle的某个构造器。
		//如果类中没有显示定义构造器，则就调用默认的构造器。public 类名(){}
		//Java类中，类的定义者显式定义了一个或多个构造方法。创建对象时，JVM
		//就不提供默认无参数的构造方法(器)。
		Circle c= new Circle();
		Scanner scanner = new Scanner(System.in);
		int r=scanner.nextInt();
		c.setRadius(r);
		scanner.close();
		System.out.println("now Circlearea "+c.circlearea());
		System.out.println("now Radius "+c.getRadius());
	}
}
