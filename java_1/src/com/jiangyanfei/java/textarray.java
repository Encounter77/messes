package com.jiangyanfei.java;
import java.util.Scanner;
public class textarray {
	public static void main(String [] args){
		Scanner scanner = new Scanner (System.in);//�����µ�Scanner����
		System.out.print("������ѧ��������");
		int count = scanner.nextInt();//�Ӽ���������ѧ����������ֵ������count
		System.out.print("������"+count+"��ͬѧ�ĳɼ�:");
		int [] scores = new int[count];//���岢��������scores
		int maxscores=0;
		for(int i=0;i<scores.length;i++){
			scores[i] =scanner.nextInt();//ѭ��������������ѧ���ɼ�
			if(scores[i]>maxscores){	 //ɸѡ����߳ɼ�maxscores
				maxscores=scores[i];
			}
		}
		scanner.close();				//�ر�Scanner��
		System.out.println("maxscores="+maxscores);
		//�������ڳɼ�������Ӧ����
		for(int i=0;i<scores.length;i++){
			if(scores[i]>=maxscores-10){
				System.out.println("student "+(i+1)+"scores is "+scores[i]+" grade is A");
			}else if(scores[i]>=maxscores-20)
			{
				System.out.println("student "+(i+1)+"scores is "+scores[i]+" grade is B");
			}else if(scores[i]>=maxscores-30)
			{
				System.out.println("student "+(i+1)+"scores is "+scores[i]+" grade is C");
			}else{
				System.out.println("student "+(i+1)+"scores is "+scores[i]+" grade is D");
					}	
		}
	}
}
