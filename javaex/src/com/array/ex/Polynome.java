package com.array.ex;

import java.util.Scanner;

public class Polynome {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		int[] pol = new int [101]; //�����±��ʾ����,����Ԫ��ֵ��ʾ��ϵ��
		int i,c,maxindex=0,count=0;
		boolean fristdata = true;  //��ǵ�һ�������Ԫ��
		while(count!=2){           //��¼�������ʽ�ĸ���
			i = scanner.nextInt();
			c = scanner.nextInt();
			pol[i]+=c;
			if(i>maxindex){
				maxindex = i;     //������ʱ���±����ɸѡ����
			}
			if(i==0){
				count++;
			}
		}
		for(i=maxindex;i>=0;i--){
			if(pol[i]!=0){
				if(fristdata){
					fristdata = false;
				}else{
					System.out.print("+");
				}
				if(i==0){
					System.out.print(pol[i]);
				}else if(i==1){
					System.out.print(pol[i]+"x");
				}else{
					System.out.print(pol[i]+"x"+i);
				}
			}
		}
		scanner.close();
	}
}
