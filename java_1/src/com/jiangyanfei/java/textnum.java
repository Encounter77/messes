package com.jiangyanfei.java;

public class textnum {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		 int i,j;
		 boolean flag=true;//标记素数
		 long begin = System.currentTimeMillis();//标记程序开始运行时间
			for(j=2;j<=100;j++){
				flag=true;//重置标记
				for(i=2;i<j;i++){
					if(j%i==0){
					  flag=false;
					  break;
					}
				}	
				if(flag)
				System.out.println(j);	
			}
			long end = System.currentTimeMillis();//标记程序运行结束时的时间
			System.out.println("time="+(end-begin));//表示程序运行所用的时间ms
	}

}
