package com.array.ex;

import java.util.Scanner;

public class ChessThree {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int [][] chess = new int [3][3];
		int i,j;
		int cnt=0;
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				chess[i][j]=scanner.nextInt();
				}
			}
		if((chess[0][0]==1&&chess[0][1]==1&&chess[0][2]==1)||(chess[1][0]==1
			&&chess[1][1]==1&&chess[1][2]==1)||(chess[2][0]==1&&chess[2][1]==1
			&&chess[2][2]==1)||(chess[0][0]==1&&chess[1][0]==1&&chess[2][0]==1)
			||(chess[0][1]==1&&chess[1][1]==1&&chess[2][1]==1)||(chess[0][2]==1
			&&chess[1][2]==1&&chess[2][2]==1)||(chess[0][0]==1&&chess[1][1]==1
			&&chess[2][2]==1)||(chess[0][2]==1&&chess[1][1]==1&&chess[2][0]==1)){
			System.out.println("A Win");
		}else{cnt++;}
		if((chess[0][0]==0&&chess[0][1]==0&&chess[0][2]==0)||(chess[1][0]==0
				&&chess[1][1]==0&&chess[1][2]==0)||(chess[2][0]==0&&chess[2][1]==0
				&&chess[2][2]==0)||(chess[0][0]==0&&chess[1][0]==0&&chess[2][0]==0)
				||(chess[0][1]==0&&chess[1][1]==0&&chess[2][1]==0)||(chess[0][2]==0
				&&chess[1][2]==0&&chess[2][2]==0)||(chess[0][0]==0&&chess[1][1]==0
				&&chess[2][2]==0)||(chess[0][2]==0&&chess[1][1]==0&&chess[2][0]==0)){
				System.out.println("B Win");
		}else{cnt++;}
		if(cnt==2)
			System.out.println("No Win");
		scanner.close();
	}
}
