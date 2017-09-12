package test1;

import java.util.Scanner;

public class Rs {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int r,s;
		String str1 = null,str2 = null;
		int num = scanner.nextInt();
		if(num>=11&&num<=59){
			r = num/10;
			s = num%10;
			switch(r){
			case 1:	str1 = "unreadable";break;
			case 2: str1 = "barely readable, occasional words distinguishable";break;
			case 3: str1 = "readable with considerable difficulty";break;
			case 4: str1 = "readable with practically no difficulty";break;
			case 5: str1 = "perfectly readable";break;	
			}
			switch(s){
			case 1:	str2="Faint signals, barely perceptible";break;
			case 2:	str2="Very weak signals";break;
			case 3:	str2="Weak signals";break;
			case 4:	str2="Fair signals";break;
			case 5:	str2="Fairly good signals";break;
			case 6:	str2="Good signals";break;
			case 7:	str2="Moderately strong signals";break;
			case 8:	str2="Strong signals";break;
			case 9:	str2="Extremely strong signals";break;
			}
		}
		System.out.println(str2+", "+str1+".");
		scanner.close();
	}
}
