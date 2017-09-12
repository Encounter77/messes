package com.jiangyanfei.java;

public class textdoublearray {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [][] aa= new int [4][];//声明一个4行的二维数组
		//二维数组的初始化
		for(int i=0;i<aa.length;i++){
			aa[i]= new int [i+1];
		}
		//遍历二维数组并输出其中的元素(默认0)
		for(int i=0;i<aa.length;i++){
			for(int j=0;j<aa[i].length;j++){
				System.out.print(aa[i][j]);
			}
			System.out.println();
		}
	}

}
