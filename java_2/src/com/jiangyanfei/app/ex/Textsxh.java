package com.jiangyanfei.app.ex;

public class Textsxh {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		for(int w=100;w<999;w++){
			int i =  w%10;         //个位
			int j = (w%100)/10;   //十位
			int k =  w/100;		  //百位
			if(i*i*i+j*j*j+k*k*k==w){
				System.out.println("水仙花数:"+w);
			}
		}

	}

}
