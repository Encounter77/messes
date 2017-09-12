package com.array.ex;

import java.util.Scanner;

public class Polynome1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] pol1 = new int [10];
		int[] pol2 = new int [10];
		int max=0,cnt1=0,cnt2=0,frist1=0,frist2=0;
		int index1=1,index2=1;
		int values1=1,values2=1;
		
		while(index1!=0){
			index1 = scanner.nextInt();
			values1 = scanner.nextInt();
			if(cnt1==0){
				pol1[index1] = values1;
				cnt1++;
				frist1 = index1;
			}else{
				pol1[index1] = values1;
			}
		}
		
		while(index2!=0){
			index2 = scanner.nextInt();
			values2 = scanner.nextInt();
			if(cnt2==0){
				pol2[index2] = values2;
				cnt2++;
				frist2 = index2;
			}else{
				pol2[index2] = values2;
			}
		}
		
		if(frist1>=frist2){
			max = frist1;
		}else{
			max = frist2;
		}
		
		for(int i=max;i>=0;i--){
			if(pol1[i]==0&&pol2[i]==0){
			}else{
				if(i==0){
					System.out.print(pol1[i]+pol2[i]);
				}else if(i==1){
					System.out.print((pol1[i]+pol2[i])+"x"+"+");
				}else{
					System.out.print((pol1[i]+pol2[i])+"x"+i+"+");
				}
			}
		}
		scanner.close();
	}
}

