package com.jiangyanfei.java;
/*
 * 杨辉三角(二项式展开式系数)
 * 1							(a+b)^0			1
 * 1	1						(a+b)^1			a+b			
 * 1	2	1					(a+b)^2			a^2+2ab+b^2
 * 1	3	3	1				(a+b)^3			...	
 * 1	4	6	4	1
 * 1	5	10	40	5	1
 * ..... 
 * */
/*
 * 特点:1.每一行的两端都是1。yh[i][0]=1,yh[i][i]=1。
 * 	   2.每一行非1的元素都是由它所在的那一列的上一个元素和其前一个元素的和。
 * 		 yh[i][j]=yh[i-1][j]+yh[i-1][j-1];
 * 		  其中:(i>1&&j>0&&j<i)
 * 	   3.第n行有n个元素
 * */

public class textyanghuisanjiao {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		//定义一个10行的二维数组
		int [][]yh = new int [10][];
		//对二维数组进行初始化(每行两端都为1)
		for(int i=0;i<yh.length;i++){
			yh[i]= new int [i+1];
			yh[i][0]=1;
			yh[i][i]=1;
		}
		for(int i=0;i<yh.length;i++){
			for(int j=0;j<yh[i].length;j++){
				//对非1元素初始化并输出
				if(i>0&&j>0&&j<i){
					yh[i][j]=yh[i-1][j]+yh[i-1][j-1];
				}
				System.out.print(yh[i][j]+"  ");
			}
			System.out.println();
		}
	}

}

