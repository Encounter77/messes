package atm;

import java.util.Scanner;

public class Withdraw {
	public Withdraw() {
	}

	public void getMoney(Account user) {
		Scanner scan = new Scanner(System.in);
		System.out.print("��������ȡǮ�Ľ�");
		double money = scan.nextDouble();
		if (money <= 0) {
			System.out.println("�������");
		} else if (money > user.getBalance()) {
			System.out.println("����");
		} else {
			money = user.getBalance() - money;
			user.setBalance(money);
		}
		System.out.println("��������ɣ��㵱ǰ�����" + user.getBalance() + "Ԫ!");
	}
}