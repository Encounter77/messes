package com.jiangyanfei.app.ex;

public class Methodoverload {
	
	int MOL(int i){
		return i*i;
	}
	int MOL(int a,int b){
		return a*b;
	}
	String MOL(String k){
		return k+" CallMOL";
	}		
	
	public static void main(String [] args){
		Methodoverload j = new Methodoverload();
		int a= j.MOL(5);
		System.out.println("a="+a);
		String b = j.MOL("hello");
		System.out.println("b="+b);
		int c = j.MOL(2, 3);
		System.out.println("c="+c);
	}
	
}
