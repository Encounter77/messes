package com.jiangyanfei.ex2;
/*
 * ��̬:ͬ�����͵ı���������ͬ���ķ�����ȴ������ͬ����Ϊ(p1,p2,p3)
 * ������̬������:
 * 	 ���������͵ı���ָ������Ķ���,���ø����б���д�ķ���ʱ��
 * �ڶ�̬�������(���������͵ı���ָ������Ķ���):���಻�ܵ�������ӵķ�����(work,shopping)
 * �����Ҫ���������ķ���:ǿ������ת����
 * ǿ������ת����Ҫע��ĵط�  1.����Ķ������ת��Ϊ������κ����ͣ������ܷ���ת���쳣��
 * 			          2.ֻ�о߱����ӹ�ϵ������²ſ��Խ���ǿ������ת����(���й�ϵ����)	
 * */

public class TextPerson {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.walk();
		
		Person p2 = new Man();
		p2.walk();
		
		//ǿ������ת��
		Man man = (Man) p2;
		man.work();
		
		Person p3 = new Woman();
		p3.walk();
		
		//ǿ������ת��
		Woman woman = (Woman) p3;
		woman.shopping();
	}
}
