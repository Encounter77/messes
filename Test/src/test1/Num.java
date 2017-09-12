package test1;

import java.util.Scanner;

public class Num {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int i;
		double sum=0;
		String str = String.valueOf(num);
		char[] c = str.toCharArray();
		for(i=c.length-1;i>=0;i--){
			if((c[i]%2==0&&(i+1)%2==0)||(c[i]%2!=0&&(i+1)%2!=0)){
				c[i]=1;
			}else{
				c[0]=0;
			}
		}
		
		for(i=0;i<c.length;i++){
			System.out.println(c[i]);
		}
		
		for(i=c.length-1;i>=0;i--){
			sum=sum+c[i]*Math.pow(2,c.length-i-1);
		}
		System.out.println(sum);
		scanner.close();
	}
}
