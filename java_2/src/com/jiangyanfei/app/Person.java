package com.jiangyanfei.app;
//ʹ�ùؼ���class������һ����:person
public class Person {
	//�����������: 1.������ ������
	String name;
	//2.������ ������ = ��ʼֵ
	int age = 10;
	
	//������ķ���
	//1.������ֵ�ķ���  ����ֵ����  ������(){..return ����ֵ;}
	int getAge(){
		return age;
	}
	//2.��������ֵ�ķ��� : Ҳ������return��ʾ��������
	//return ֻ�Ǳ�Ƿ���������return���������
	void shout(){
		System.out.println();
		//return;
	}
	//3.����������������ֵ�ķ���
	void hello(String name){
		System.out.print("hello"+name);
	}
	//4.��������������ֵ�ķ��� 
	int add(int i,int j){
		return i+j;
	}
	
 }
