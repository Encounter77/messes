package com.jiangyanfei.java;

public class textnum {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		 int i,j;
		 boolean flag=true;//�������
		 long begin = System.currentTimeMillis();//��ǳ���ʼ����ʱ��
			for(j=2;j<=100;j++){
				flag=true;//���ñ��
				for(i=2;i<j;i++){
					if(j%i==0){
					  flag=false;
					  break;
					}
				}	
				if(flag)
				System.out.println(j);	
			}
			long end = System.currentTimeMillis();//��ǳ������н���ʱ��ʱ��
			System.out.println("time="+(end-begin));//��ʾ�����������õ�ʱ��ms
	}

}
