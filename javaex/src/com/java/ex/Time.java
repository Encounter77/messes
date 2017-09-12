package com.java.ex;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		int a=0,b=0;
		a = x%100;
		b = x/100;
		if(a>=0&&a<=60&&b>=0&&b<=23){
		if(b==0){
			if(a>=10){
				if(a/60>=1){
					b++;
					System.out.println((24+(b-8))*100+a%60);
				}else{
					System.out.println((24+(b-8))*100+x);	
				}	
		    }else{
				System.out.println(1600+a);
			}	
		}else
		{
			if(b>8){
				if(a/60>=1){
					if(b>=23){
						System.out.println("时间超范围1");
					}else{
						b++;
						System.out.println((b-8)*100+a%60);
					}	
				}else{
					System.out.println((b-8)*100+a);
				}		
			}
			if(b<8){
				if(a/60>=1){
						b++;
						System.out.println((24+(b-8))*100+a%60);
					}else{
					System.out.println((24+(b-8))*100+a);
				    }	
			    }
			if(b==8){
				if(a/60>=1){
					b++;
					System.out.println((b-8)*100+a%60);
				}else{
					System.out.println((24+(b-8))*100+a);
				}
			}
		  }
		}
		
		if(a>60&&b>=0&&b<23){
				int c=b;
				if(b<8){
					b++;
					System.out.println((24+(b-8))*100+a%60);
					b=c;
				}
				if(b==8){
					b++;
					System.out.println((b-8)*100+a%60);
					b=c;
				}
				if(b>8){
					b++;
					System.out.println((b-8)*100+a%60);
					b=c;
				}
		}
	}
}


