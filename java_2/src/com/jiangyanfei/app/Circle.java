package com.jiangyanfei.app;
/*
 * ��Ϣ�ķ�װ������
 * 1.������������������private�ؼ��֡�
 * 2.����public�� setXXX��getXXX�������������ԡ�
 * 
 * */
public class Circle {
	//Ĭ�Ϲ�����
	/*1.����������ͬ������û�з���ֵ��(voidҲ����д)
	 *2.JVM��Ϊÿһ���ഴ��һ��Ĭ�ϵ��޲����Ĺ��췽��(��)��
	 *3.������������:Ϊ������Խ��г�ʼ����
	 */
	  /* public Circle(){
	 			radius = 10;
	  		}*/
	
	//����radius����
	private int radius;
	//�������ʷ���1.Ϊ���Ը�ֵ��set����
	public void setRadius(int r){
		if(r<0){
			System.out.println("����ֵ:Radius="+r+" Ĭ�ϸ�ֵ:Radius="+radius);
			return;
		}
		radius=r;
	} 
	//2.��ȡ����ֵ��get����
	public int getRadius(){
		return radius;
	}
	//���������circlearea����
	public double circlearea(){
		return 3.14*radius*radius;
	}
}
