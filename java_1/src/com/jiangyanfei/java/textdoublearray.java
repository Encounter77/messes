package com.jiangyanfei.java;

public class textdoublearray {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		int [][] aa= new int [4][];//����һ��4�еĶ�ά����
		//��ά����ĳ�ʼ��
		for(int i=0;i<aa.length;i++){
			aa[i]= new int [i+1];
		}
		//������ά���鲢������е�Ԫ��(Ĭ��0)
		for(int i=0;i<aa.length;i++){
			for(int j=0;j<aa[i].length;j++){
				System.out.print(aa[i][j]);
			}
			System.out.println();
		}
	}

}
