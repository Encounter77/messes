package com.array.ex;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int[] array = new int [100];
		int num=0,i=0;
		int cnt1=0,cnt2=0;
		while(num!=-1){
			num = scanner.nextInt();
			array[i++] = num;
		}
		for(int j=0;j<i-1;j++){
			if(array[j]%2==0){
				cnt1++;
			}else{
				cnt2++;
			}
		}
		System.out.println(cnt2+" "+cnt1); 
		scanner.close();
	}

}
