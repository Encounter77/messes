package test1;


import java.util.Scanner;

public class NumFeature{


	public static void main(String [] args){
	
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt();
	double sum=0,cnt=0;
	while (num!=0){
		cnt++;
		if((num%10+cnt)%2==0)
			sum=sum+Math.pow(2, cnt-1);
		num=num/10;
	}
		System.out.println((int)sum);
		scanner.close();
    }
}
