package atm;

import java.util.Scanner;

public class ATM {
	private Account account;

	public ATM() {
		account = new Account();
		account.setName("123456");
		account.setPassword("123456");
		account.setBalance(5000);
	}

	// 运行ATM
	public void run() {
		this.welcome();
		int num = 0;		// 计数器，为登陆次数计数，不能超过3次
		while (num < 3) {	// 三次登陆机会
			num++;
			boolean flag = this.login();	
			if (flag) {
				System.out.println("欢迎你," + account.getName()+"!");
				while (true) {
					int choice = this.item();
					switch (choice) {
					case 1:
						Query query = new Query();
						query.queryMoney(account);
						break;
					case 2:
						Deposit deposit = new Deposit();
						deposit.storeMoney(account);
						break;
					case 3:
						Withdraw withdraw = new Withdraw();
						withdraw.getMoney(account);
						break;
					case 4:
						Resive resive = new Resive();		
						resive.changePassWord(account);
						break;
					default:
						exit();
						break;
					}
				}
			} else {
				System.out.println("登陆失败,您的卡号或密码有误!");
				if (num == 3) {
					System.out.println("您已经连续三次输错密码,本机不能再为您服务,谢谢您的使用！");
				}
			}
		}
	}

	// 选择界面
	public int item() {
		Scanner scan = new Scanner(System.in);
		System.out.println("请选择你要操作的选项");
		System.out.println("1.查询");
		System.out.println("2.存钱");
		System.out.println("3.取钱");
		System.out.println("4.修改密码");
		System.out.println("5.转账");
		System.out.println("6.退出");
		System.out.println();
		System.out.print("请选择：");
		int choice = scan.nextInt();
		return choice;
	}

	public void welcome() {
		System.out.println("*****欢迎使用我的ATM*****");
	}

	public void exit() {
		System.out.println("谢谢你的使用，再见！");
		System.exit(0);
	}

	//登录验证
	public boolean login() {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入用户名：");
		String name = scan.nextLine();
		System.out.print("请输入密码：");
		String password = scan.nextLine();
		if (name.equals(account.getName())
				&& password.equals(account.getPassword())) {
			return true;
		}
		return false;
	}
}