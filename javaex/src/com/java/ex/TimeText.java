package com.java.ex;

import java.util.Scanner;

public class TimeText {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		scanner.close();
		long begin = System.currentTimeMillis();
		if(x>=0&&x<=2359){
			int a = x/100;
			int b = x%100;
			if(a==0){
				if(b>=60){
					System.out.println((17+a)*100+b%60);
				}else{
					System.out.println((16+a)*100+b);
				}
			}else{
				if(b>=60){
					if(a<8){
						System.out.println((17+a)*100+b%60);
					}else if(a>=8){
						System.out.println((a-7)*100+b%60);
					}
				}else{
					if(a<=8){
						System.out.println((17+a)*100+b);
					}else{
						System.out.println((a-8)*100+b);
					}
				}
			}	
		}else{
			System.out.println("时间超范围");
		}
		long end = System.currentTimeMillis();
		System.out.println("RunTime="+(end-begin));
	}

}
