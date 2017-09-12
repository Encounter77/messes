package com.jiangyanfei.app.ex;

public class Person {
	//类属性通常需要被隐藏，引用get/set方法。
	private String name;
	private int age;
	private String school;
	private String major;
	//重载构造方法
	public Person(String n,int a){
		name = n;
		age = a;
	}
	public Person(String n,int a, String s){
		this(n,a);//利用this调用重载构造器
		school = s;	
	}
	public Person(String n,int a, String s,String m){
		this(n,a,s);//利用this调用重载构造器
		major = m;
	}
	//调用get/set方法
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;//this调用当前对象
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	
	public static void main(String [] args){
		Person p = new Person("jiangyanfei", 20, "qingdao");
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getSchool());
	}
}
