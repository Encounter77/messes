package com.jiangyanfei.app.ex;

public class Textws {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
		for(int s=2;s<1000;s++){
			int c = 1;
			for(int l=2;l<s;l++){
				if(s%l==0){
					c+=l;
				}		
			}
			if(c==s){
				System.out.println("完数:"+s);
			}
		}		
	}
}
