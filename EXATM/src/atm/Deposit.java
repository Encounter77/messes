package atm;

import java.util.Scanner;

public class Deposit {

	public Deposit() {

	}

	public void storeMoney(Account user) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入你存钱的金额：");
		float money = scan.nextFloat();
		if (money <= 0) {
			System.out.println("输入错误");
		} else {
			money += user.getBalance();
			user.setBalance(money);
		}
		System.out.println("操作已完成，你当前金额是" + user.getBalance() + "元!");
	}
}
