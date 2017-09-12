package test4;

import java.util.Date;
import java.util.Scanner;

public class TestDate {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		Date d = new Date(year-1900,month-1,day);
		if(d.getDay()==0){
			System.out.println("星期日");
		}else{
			System.out.println("星期"+d.getDay());
		}
		if(d.getYear()%4==0&&d.getYear()%100!=0||d.getYear()%400==0){
			System.out.println("闰年");
		}else{
			System.out.println("平年");
		}
		scanner.close();
	}
}
