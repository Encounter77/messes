package com.array.ex;

import java.util.Scanner;

public class VoteStatistical {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int[] a = new int [10];
		int x = scanner.nextInt();
		while(x!=-1){
			if(x>=0&&x<=9){
				a[x]++;                 //默认值0,用数组存放数字x的出现次数。
			}
			x = scanner.nextInt();
		}
		scanner.close();
		for(int i=0;i<a.length;i++){
			System.out.println(i+"的次数:"+a[i]);
		}
	}
}
