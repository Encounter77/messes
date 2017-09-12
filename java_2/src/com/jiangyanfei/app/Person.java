package com.jiangyanfei.app;
//使用关键字class创建了一个类:person
public class Person {
	//定义类的属性: 1.类型名 属性名
	String name;
	//2.类型名 变量名 = 初始值
	int age = 10;
	
	//定义类的方法
	//1.带返回值的方法  返回值类型  方法名(){..return 返回值;}
	int getAge(){
		return age;
	}
	//2.不带返回值的方法 : 也可以用return标示方法结束
	//return 只是标记方法结束，return后不能有语句
	void shout(){
		System.out.println();
		//return;
	}
	//3.含参数，不含返回值的方法
	void hello(String name){
		System.out.print("hello"+name);
	}
	//4.含参数，含返回值的方法 
	int add(int i,int j){
		return i+j;
	}
	
 }
