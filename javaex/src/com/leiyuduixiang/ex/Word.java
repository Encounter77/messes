package com.leiyuduixiang.ex;

import java.util.Scanner;

public class Word {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int i=0;
		Scanner scanner = new Scanner(System.in);
		String str =scanner.nextLine();
		String[] strs = str.split(" +|\\.");//�Զ���ո��'.'��Ϊ�ָ�����('+'������)
		for(i=0;i<strs.length-1;i++){
			if(strs[i].length()!=0){
				System.out.print(strs[i].length()+" ");
			}
		}
		System.out.print(strs[i].length());//���һ�����û�к���Ŀո�
		scanner.close();
	}
}


