package com.jiangyanfei.ex2;
/*
 * 多态:同样类型的变量，调用同样的方法，却产生不同的行为(p1,p2,p3)
 * 产生多态的条件:
 * 	 当父类类型的变量指向子类的对象,调用父类中被重写的方法时。
 * 在多态的情况下(当父类类型的变量指向子类的对象):子类不能调用新添加的方法。(work,shopping)
 * 如果需要调用新增的方法:强制类型转换。
 * 强制类型转换需要注意的地方  1.父类的对象可以转换为子类的任何类型，但可能发生转换异常。
 * 			          2.只有具备父子关系的情况下才可以进行强制类型转换。(并列关系不可)	
 * */

public class TextPerson {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.walk();
		
		Person p2 = new Man();
		p2.walk();
		
		//强制类型转换
		Man man = (Man) p2;
		man.work();
		
		Person p3 = new Woman();
		p3.walk();
		
		//强制类型转换
		Woman woman = (Woman) p3;
		woman.shopping();
	}
}
