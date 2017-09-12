package com.jiangyanfei.ex;

public class Kid1 extends ManKind{
	public int yearsold;
	public void printAge(){
		System.out.println(yearsold);
		//super.Employeed();
		//super 调用父类方法
	}
	
	public static void main(String[] args) {
		Kid1 somekid = new Kid1();
		somekid.salary=1;
		somekid.sex=0;
		somekid.Employeed();
		somekid.ManorWoman();
		somekid.yearsold=18;
		somekid.printAge();	
		}
	}
