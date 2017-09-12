package com.jiangyanfei.ex;

public class ManKind {

	public int sex;
	public int salary;
	public void ManorWoman(){
		if(sex==1){
			System.out.println("man");
		}
		if(sex==0){
			System.out.println("woman");
		}
	} 
	public void Employeed(){
		if(salary==0){
			System.out.println("no job");
			}
		if(salary!=0){
			System.out.println("job");
		}
	}
}
