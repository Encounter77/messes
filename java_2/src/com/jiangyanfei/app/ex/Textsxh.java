package com.jiangyanfei.app.ex;

public class Textsxh {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		for(int w=100;w<999;w++){
			int i =  w%10;         //��λ
			int j = (w%100)/10;   //ʮλ
			int k =  w/100;		  //��λ
			if(i*i*i+j*j*j+k*k*k==w){
				System.out.println("ˮ�ɻ���:"+w);
			}
		}

	}

}
