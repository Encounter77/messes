package test1;

import java.util.Scanner;

public class Time {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int utc;
		int u, d;
		utc = scanner.nextInt();
		u = utc % 10;			//�������ݵĸ�λ����
		d = utc % 100 / 10;		//�������ֵ�ʮλ����
		utc = utc / 100;		//�������ֵİ�λ����
		if(utc < 8){
			utc = (utc + 16);
			System.out.print(utc);
			System.out.print(d);
			System.out.println(u);
		}
		else if(utc == 8)
		{
			if(d != 0)
			System.out.print(d);
			System.out.println(u);
		}
		else if(utc > 8){
			System.out.print(utc - 8);
			System.out.print(d);
			System.out.println(u);
		}
		scanner.close();
	}
}