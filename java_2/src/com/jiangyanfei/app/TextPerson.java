package com.jiangyanfei.app;

public class TextPerson {
	public static void main(String [] args){
	//用关键字new创建一个类Person的对象p1
		Person p1 = new Person();
	
	//为对象的属性赋值，"."运算符
		p1.age=20;
		p1.name="jiangyanfei";
	
	//调用对象的方法，"."运算符
		int age=p1.getAge();                 //带返回值
		System.out.println(age);			 
		p1.shout();							//不带返回值
		int result= p1.add(2, 5);			//带返回值
		System.out.println(result);
		p1.hello(" Tom");					//不带返回值
		
	//匿名对象:使用一次就无效
		new Person().shout(); 
		
	}
}
