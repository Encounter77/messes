package com.jiangyanfei.app;

public class TextPerson {
	public static void main(String [] args){
	//�ùؼ���new����һ����Person�Ķ���p1
		Person p1 = new Person();
	
	//Ϊ��������Ը�ֵ��"."�����
		p1.age=20;
		p1.name="jiangyanfei";
	
	//���ö���ķ�����"."�����
		int age=p1.getAge();                 //������ֵ
		System.out.println(age);			 
		p1.shout();							//��������ֵ
		int result= p1.add(2, 5);			//������ֵ
		System.out.println(result);
		p1.hello(" Tom");					//��������ֵ
		
	//��������:ʹ��һ�ξ���Ч
		new Person().shout(); 
		
	}
}
