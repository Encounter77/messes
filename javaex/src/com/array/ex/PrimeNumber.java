package com.array.ex;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		int[] prime = new int [200]; //���±�+1��ʾ�ǵڼ���������Ԫ��ֵΪ���Ӧ������
		int i,j,c=0,sum=0;
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		boolean sign = true;
		for(i=2;;i++){
			sign = true;
			for(j=2;j<i;j++){
				if(i%j==0){
					sign = false;
					break;
				}
			}
			if(sign){
				prime[c++]=i;
			}
			if(c==m){
				break;
			}
		}
		for(i=n;i<=m;i++){
			sum+=prime[i-1];
		}
		System.out.println(sum);
		scanner.close();
	}
}
