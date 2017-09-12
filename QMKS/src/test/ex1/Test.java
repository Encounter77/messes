package test.ex1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculator cal = new Calculator(1, 2);
		System.out.println("预先计算\n" + cal.getCount1() + "+"
				+ cal.getCount2() + "=" +cal.add());
		System.out.println(cal.getCount1() + "-"
				+ cal.getCount2() + "=" +cal.minus());
		System.out.println(cal.getCount1() + "*"
				+ cal.getCount2() + "=" +cal.multiply());
		System.out.println(cal.getCount1() + "/"
				+ cal.getCount2() + "=" +cal.divide());
		System.out.print("请通过键盘输入两个数(数字之间以空格分隔):");
		Calculator cal2 = new Calculator(scanner.nextDouble(),
				scanner.nextDouble());
		System.out.println("根据键盘输入计算\n" + cal2.getCount1() + "+"
				+ cal2.getCount2() + "=" + cal2.add());
		System.out.println(cal2.getCount1() + "-" + cal2.getCount2() + "="
				+ cal2.minus());
		System.out.println(cal2.getCount1() + "*" + cal2.getCount2() + "="
				+ cal2.multiply());
		System.out.println(cal2.getCount1() + "/" + cal2.getCount2() + "="
				+ cal2.divide());
		scanner.close();
	}
}
