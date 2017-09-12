package com.array.ex;

import java.util.Scanner;

public class PrimeNumber3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int num3 = scanner.nextInt();
		scanner.close();
		boolean found = true;
		if(num3==1||num3%2==0&&num3!=2){
			found = false;
		}else{
			for(int i=3;i<Math.sqrt(num3);i++){
				if(num3%i==0){
					found = false;
					break;
				}
			}
		}
		if(found){
			System.out.println(num3+"是素数");
		}else{
			System.out.println(num3+"不是素数");
		}
	}

}
