package java_4.ex2;

import java.util.Scanner;

public class PalindromicNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		
		if(s.equals(new StringBuffer(s).reverse().toString())){
			System.out.println(s+"�ǻ�����");	
		}else{
			System.out.println(s+"���ǻ�����");
		}
		scanner.close();
	}
}
