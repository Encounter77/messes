package atm;

import java.util.Scanner;

public class Deposit {

	public Deposit() {

	}

	public void storeMoney(Account user) {
		Scanner scan = new Scanner(System.in);
		System.out.print("���������Ǯ�Ľ�");
		float money = scan.nextFloat();
		if (money <= 0) {
			System.out.println("�������");
		} else {
			money += user.getBalance();
			user.setBalance(money);
		}
		System.out.println("��������ɣ��㵱ǰ�����" + user.getBalance() + "Ԫ!");
	}
}
