package com.java.ex;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		double x = scanner.nextDouble();
		System.out.println(x);
		scanner.close();
		double y = 0;
		y = 5*(x-32)/9.0;
		System.out.println((int)y);
		

	}

}
