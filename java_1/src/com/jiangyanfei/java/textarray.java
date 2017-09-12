package com.jiangyanfei.java;
import java.util.Scanner;
public class textarray {
	public static void main(String [] args){
		Scanner scanner = new Scanner (System.in);//创建新的Scanner对象
		System.out.print("请输入学生人数：");
		int count = scanner.nextInt();//从键盘上输入学生人数并赋值给变量count
		System.out.print("请输入"+count+"个同学的成绩:");
		int [] scores = new int[count];//定义并引用数组scores
		int maxscores=0;
		for(int i=0;i<scores.length;i++){
			scores[i] =scanner.nextInt();//循环向数组中输入学生成绩
			if(scores[i]>maxscores){	 //筛选出最高成绩maxscores
				maxscores=scores[i];
			}
		}
		scanner.close();				//关闭Scanner类
		System.out.println("maxscores="+maxscores);
		//对数组内成绩进行相应操作
		for(int i=0;i<scores.length;i++){
			if(scores[i]>=maxscores-10){
				System.out.println("student "+(i+1)+"scores is "+scores[i]+" grade is A");
			}else if(scores[i]>=maxscores-20)
			{
				System.out.println("student "+(i+1)+"scores is "+scores[i]+" grade is B");
			}else if(scores[i]>=maxscores-30)
			{
				System.out.println("student "+(i+1)+"scores is "+scores[i]+" grade is C");
			}else{
				System.out.println("student "+(i+1)+"scores is "+scores[i]+" grade is D");
					}	
		}
	}
}
