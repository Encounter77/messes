package com.array.ex;

import java.util.Scanner;

public class PrimeNumber1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
			System.out.println(num1+"������");
		}else{
			System.out.println(num1+"��������");
		}
	}
}
