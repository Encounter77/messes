package com.array.ex;

import java.util.Scanner;

public class PrimeNumbermy {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		/*当输入1时,不进入循环体,i的初始值为2,必定i!=1;所以输出1不是素数
		 */
		scanner.close();
		int i;
		for(i=2;i<num;i++){
			if(num%i==0){
				break;
			}
		}
		if(i==num){
			System.out.println(num+"是素数");
		}else{
			System.out.println(num+"不是素数");
		}
	}
}
