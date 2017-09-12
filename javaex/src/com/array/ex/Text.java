package com.array.ex;

import java.util.Scanner;

public class Text {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner input=new Scanner(System.in);
		int[] a=new int[100];
		int i,count=0,k,max=0;
			do{			//输入运算
				i=input.nextInt();
				k=input.nextInt();
				if(i>max) //选最大
				{
					max=i;
				}
				if(i==0) //计数多项式
				{
					count++;
				}
			if(count==0) //第一个多项式输入
			{
				a[i]=k;
			}
			else		//第二个多项式输入并运算
			{
						a[i]+=k;	
				}
			}while(count!=2);
		
			for(i=max;i>=0;i--)//输出
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
