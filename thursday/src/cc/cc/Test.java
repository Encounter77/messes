package cc.cc;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year,month,date;
		Scanner in = new Scanner(System.in);
		System.out.println("��������ĳ��� �� �� ��");
		year=in.nextInt();
		month=in.nextInt();
		date=in.nextInt();
		Date a= new Date(year,month,date);
		a.week();
		a.Leapyear();
	}

}
