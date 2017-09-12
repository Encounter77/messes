package com.jiangyanfei.app.ex;

public class Person {
	//������ͨ����Ҫ�����أ�����get/set������
	private String name;
	private int age;
	private String school;
	private String major;
	//���ع��췽��
	public Person(String n,int a){
		name = n;
		age = a;
	}
	public Person(String n,int a, String s){
		this(n,a);//����this�������ع�����
		school = s;	
	}
	public Person(String n,int a, String s,String m){
		this(n,a,s);//����this�������ع�����
		major = m;
	}
	//����get/set����
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
		this.school = school;//this���õ�ǰ����
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
