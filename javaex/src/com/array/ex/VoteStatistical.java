package com.array.ex;

import java.util.Scanner;

public class VoteStatistical {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		int[] a = new int [10];
		int x = scanner.nextInt();
		while(x!=-1){
			if(x>=0&&x<=9){
				a[x]++;                 //Ĭ��ֵ0,������������x�ĳ��ִ�����
			}
			x = scanner.nextInt();
		}
		scanner.close();
		for(int i=0;i<a.length;i++){
			System.out.println(i+"�Ĵ���:"+a[i]);
		}
	}
}
