package com.java.ex;

public class EvenNumber {
		public int count = 0;
		public int evennumber(){
			for(int i=1;i<=100;i++){
				if(i%2==0){
					count+=i;
				}
			}
			return count;
	}
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		EvenNumber en = new EvenNumber();
		System.out.println(en.evennumber());
	}
}
