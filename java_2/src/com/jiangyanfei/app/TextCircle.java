package com.jiangyanfei.app;
import java.util.Scanner;
public class TextCircle {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//����Circle��Ķ���c��һ���ǵ�������Circle��ĳ����������
		//�������û����ʾ���幹��������͵���Ĭ�ϵĹ�������public ����(){}
		//Java���У���Ķ�������ʽ������һ���������췽������������ʱ��JVM
		//�Ͳ��ṩĬ���޲����Ĺ��췽��(��)��
		Circle c= new Circle();
		Scanner scanner = new Scanner(System.in);
		int r=scanner.nextInt();
		c.setRadius(r);
		scanner.close();
		System.out.println("now Circlearea "+c.circlearea());
		System.out.println("now Radius "+c.getRadius());
	}
}
