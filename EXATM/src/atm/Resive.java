package atm;

import java.util.Scanner;

public class Resive {

	public Resive() {

	}

	public void changePassWord(Account user) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入原密码：");
		String oldPWD = scan.nextLine();
		if (oldPWD.equals(user.getPassword())) {
			System.out.print("请输入新密码：");
			String newPWD = scan.nextLine();
			System.out.print("请再次输入新密码：");
			String reNewPWD = scan.nextLine();
			if (newPWD.equals(reNewPWD)) {
				user.setPassword(newPWD);
				System.out.println("密码修改成功!");
			} else {
				System.out.println("两次密码输入不一致，请重新操作");
			}
		} else {
			System.out.print("原密码错误!");
		}
	}
}