package com.array.ex;

import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner input=new Scanner(System.in);
		int[] a=new int[100];
		int i,count=0,k,max=0;
			do{			//��������
				i=input.nextInt();
				k=input.nextInt();
				if(i>max) //ѡ���
				{
					max=i;
				}
				if(i==0) //��������ʽ
				{
					count++;
				}
			if(count==0) //��һ������ʽ����
			{
				a[i]=k;
			}
			else		//�ڶ�������ʽ���벢����
			{
						a[i]+=k;	
				}
			}while(count!=2);
		
			for(i=max;i>=0;i--)//���
			{
				if(a[i]==0)
				{
					continue;
				}
				else if(i==0)
				{
					System.out.print(a[i]);
				}
				else
				{
					System.out.print(i+"x"+a[i]+"+");
				}
				
			}	
			input.close();
	}

}
