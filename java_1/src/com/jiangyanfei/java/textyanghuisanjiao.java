package com.jiangyanfei.java;
/*
 * �������(����ʽչ��ʽϵ��)
 * 1							(a+b)^0			1
 * 1	1						(a+b)^1			a+b			
 * 1	2	1					(a+b)^2			a^2+2ab+b^2
 * 1	3	3	1				(a+b)^3			...	
 * 1	4	6	4	1
 * 1	5	10	40	5	1
 * ..... 
 * */
/*
 * �ص�:1.ÿһ�е����˶���1��yh[i][0]=1,yh[i][i]=1��
 * 	   2.ÿһ�з�1��Ԫ�ض����������ڵ���һ�е���һ��Ԫ�غ���ǰһ��Ԫ�صĺ͡�
 * 		 yh[i][j]=yh[i-1][j]+yh[i-1][j-1];
 * 		  ����:(i>1&&j>0&&j<i)
 * 	   3.��n����n��Ԫ��
 * */

public class textyanghuisanjiao {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		//����һ��10�еĶ�ά����
		int [][]yh = new int [10][];
		//�Զ�ά������г�ʼ��(ÿ�����˶�Ϊ1)
		for(int i=0;i<yh.length;i++){
			yh[i]= new int [i+1];
			yh[i][0]=1;
			yh[i][i]=1;
		}
		for(int i=0;i<yh.length;i++){
			for(int j=0;j<yh[i].length;j++){
				//�Է�1Ԫ�س�ʼ�������
				if(i>0&&j>0&&j<i){
					yh[i][j]=yh[i-1][j]+yh[i-1][j-1];
				}
				System.out.print(yh[i][j]+"  ");
			}
			System.out.println();
		}
	}

}

