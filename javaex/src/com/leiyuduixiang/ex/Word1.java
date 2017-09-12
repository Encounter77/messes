package com.leiyuduixiang.ex;

import java.util.Scanner;

public class Word1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int cnt=0;
		for(int i=0;str.charAt(i)!='.';i++){
			if(str.charAt(i)!=' '){
				cnt++;
				if(str.charAt(i+1)==' '){
					System.out.print(cnt+" ");
					cnt=0;
				}
			}
		}
		if(cnt!=0){
			System.out.println(cnt);
		}
		scanner.close();
	}
}
