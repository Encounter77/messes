package atm;

import java.util.Scanner;

public class Withdraw {
	public Withdraw() {
	}

	public void getMoney(Account user) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入你取钱的金额：");
		double money = scan.nextDouble();
		if (money <= 0) {
			System.out.println("输入错误");
		} else if (money > user.getBalance()) {
			System.out.println("余额不足");
		} else {
			money = user.getBalance() - money;
			user.setBalance(money);
		}
		System.out.println("操作已完成，你当前金额是" + user.getBalance() + "元!");
	}
}