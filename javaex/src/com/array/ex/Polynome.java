package com.array.ex;

import java.util.Scanner;

public class Polynome {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int[] pol = new int [101]; //数组下标表示幂数,数组元素值表示其系数
		int i,c,maxindex=0,count=0;
		boolean fristdata = true;  //标记第一个输出的元素
		while(count!=2){           //记录输入多项式的个数
			i = scanner.nextInt();
			c = scanner.nextInt();
			pol[i]+=c;
			if(i>maxindex){
				maxindex = i;     //在输入时对下标进行筛选排列
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
