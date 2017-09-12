package com.array.ex;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		scanner.close();
		boolean found = true;
		if(num1==1){
			found = false;
		}
		for(int i=2;i<num1;i++){
			if(num1%i==0){
				found = false;
				break;
			}
		}
		if(found){
			System.out.println(num1+"是素数");
		}else{
			System.out.println(num1+"不是素数");
		}
	}
}
