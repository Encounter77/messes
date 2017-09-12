package com.leiyuduixiang.ex;

import java.util.Scanner;

public class Word {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int i=0;
		Scanner scanner = new Scanner(System.in);
		String str =scanner.nextLine();
		String[] strs = str.split(" +|\\.");//对多个空格和'.'作为分割条件('+'代表多个)
		for(i=0;i<strs.length-1;i++){
			if(strs[i].length()!=0){
				System.out.print(strs[i].length()+" ");
			}
		}
		System.out.print(strs[i].length());//最后一项输出没有后面的空格
		scanner.close();
	}
}


