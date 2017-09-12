package com.array.ex;

import java.util.Scanner;

public class PrimeNumber2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int num2 = scanner.nextInt();
		scanner.close();
		boolean found = true;
		if(num2==1||num2%2==0&&num2!=2){
			found = false;
		}else{
			for(int i=3;i<num2;i+=2){
				if(num2%i==0){
					found = false;
					break;
				}
			}
		}
		if(found){
			System.out.println(num2+"是素数");
		}else{
			System.out.println(num2+"不是素数");
		}
	}

}
