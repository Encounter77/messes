package com.array.ex;

import java.util.Scanner;

public class PrimeNumbermy {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		/*������1ʱ,������ѭ����,i�ĳ�ʼֵΪ2,�ض�i!=1;�������1��������
		 */
		scanner.close();
		int i;
		for(i=2;i<num;i++){
			if(num%i==0){
				break;
			}
		}
		if(i==num){
			System.out.println(num+"������");
		}else{
			System.out.println(num+"��������");
		}
	}
}
