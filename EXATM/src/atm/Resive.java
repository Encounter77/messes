package atm;

import java.util.Scanner;

public class Resive {

	public Resive() {

	}

	public void changePassWord(Account user) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ԭ���룺");
		String oldPWD = scan.nextLine();
		if (oldPWD.equals(user.getPassword())) {
			System.out.print("�����������룺");
			String newPWD = scan.nextLine();
			System.out.print("���ٴ����������룺");
			String reNewPWD = scan.nextLine();
			if (newPWD.equals(reNewPWD)) {
				user.setPassword(newPWD);
				System.out.println("�����޸ĳɹ�!");
			} else {
				System.out.println("�����������벻һ�£������²���");
			}
		} else {
			System.out.print("ԭ�������!");
		}
	}
}