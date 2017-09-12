package atm2.ex;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class ATM extends BankDB {
	private int index = -1;

	public ATM() {
		super();
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int checkAccount(String cardNumber, String passWord) {
		for (int i = 0; i < super.getList().size(); i++) {
			if (super.getList().get(i).getCardNumber().equals(cardNumber)
					&& super.getList().get(i).getCardPassword()
							.equals(passWord)) {
				index = i;
				return index;
			}
		}
		return index;
	}

	public void index() {
		System.out.println("----欢迎使用----");
	}

	public boolean login() {
		Scanner scanner = new Scanner(System.in);
		String n = null;
		String p = null;
		System.out.print("请输入卡号:");
		n = scanner.next();
		System.out.print("请输入密码:");
		p = scanner.next();
		int result = this.checkAccount(n, p);
		if (result != -1) {
			return true;
		}
		return false;
	}

	public void menu() {
		System.out.println("请选择您需要的操作:");
		System.out.println("1.查询账户信息及余额");
		System.out.println("2.存款");
		System.out.println("3.取款");
		System.out.println("4.转账");
		System.out.println("5.修改密码");
		System.out.println("6.退出");
		System.out.print("请选择:");
	}

	public void work() throws AWTException {
		Scanner scanner = new Scanner(System.in);
		int cnt = 0, choice;
		char c;
		this.index();
		do {
			cnt++;
			this.login();
			if (this.index == -1) {
				System.out.println("登陆失败,卡号或密码错误,请重新输入卡号和密码.");
			} else {
				cnt = 100;
			}
		} while (cnt < 3);
		if (cnt == 3) {
			System.out.println("很抱歉,您已经连续三次输入有误,本机不能继续再为您进行服务,谢谢您的使用.");
		} else {
			this.clear();
			System.out.println("登陆成功,"
					+ super.getList().get(index).getCardHolderName() + "你好！");
			do {
				this.menu();
				Account nacc = super.getList().get(index);
				choice = scanner.nextInt();
				switch (choice) {
				case 1:
					// busin = new Query(nacc);
					// busin.execute();
					System.out.println(new Query(nacc)
							.displayAccountInformation());
					break;
				case 2:
					System.out.print("请输入您需要存入的金额:");
					double depositmoney = scanner.nextDouble();
					if (new Deposit(nacc).deposit(depositmoney)) {
						System.out.println("存款成功！");
					}
					// busin = new Deposit(nacc);
					// busin.execute();
					break;
				case 3:
					System.out.print("请输入您需要取出的金额:");
					double withdrawmoney = scanner.nextDouble();
					if (new Withdraw(nacc).withdraw(withdrawmoney)) {
						System.out.println("取款成功！");
					} else {
						System.out.println("取款失败,您的余额不足！");
					}
					// busin = new Withdraw(nacc);
					// busin.execute();
					break;
				case 4:
					System.out.print("请输入您需要转入的账户卡号:");
					String n = scanner.next();
					int receiveresult = new Transfer(nacc, super.getList())
							.transfercheck(n);
					if (receiveresult != -1) {
						System.out.print("账号验证成功,请输入您转出的金额:");
						double m = scanner.nextDouble();
						if (new Transfer(nacc, super.getList()).transfer(
								receiveresult, m)) {
							System.out.println("转账成功！");
							// System.out.println(super.getList().get(index));
							// System.out.println(super.getList().get(receiveresult));
						} else {
							System.out.println("您的账户余额不足，无法进行转账操作！");
						}
					} else {
						System.out.println("账号不存在！");
					}
					// busin = new Transfer(nacc,super.getList());
					// busin.execute();
					break;
				case 5:
					System.out.print("请输入您的新密码:");
					String np1 = scanner.next();
					System.out.print("请再次输入您的新密码:");
					String np2 = scanner.next();
					if (np1.equals(np2)) {
						if (new Revise(nacc).revisepassword(np1)) {
							System.out.println("修改密码成功！");
							// System.out.println(super.getList().get(index).getCardPassword());
						}
					} else {
						System.out.println("两次输入密码不一致,操作取消。");
					}
					break;
				case 6:
					break;
				}
				if (choice != 6) {
					System.out.print("您是否还进行其他操作(Y/N):");
					c = scanner.next().charAt(0);
					this.clear();
				} else {
					c = 'N';
				}
			} while (c != 'N');
			System.out.println("正在退出，请勿忘记取走您的卡片。" + "\n" + "谢谢您的使用，再见！");
		}
		scanner.close();
	}

	public void clear() throws AWTException {
		Robot r = new Robot();
		r.mousePress(InputEvent.BUTTON3_MASK); // 按下鼠标右键
		r.mouseRelease(InputEvent.BUTTON3_MASK); // 释放鼠标右键
		r.keyPress(KeyEvent.VK_CONTROL); // 按下Ctrl键
		r.keyPress(KeyEvent.VK_R); // 按下R键
		r.keyRelease(KeyEvent.VK_R); // 释放R键
		r.keyRelease(KeyEvent.VK_CONTROL); // 释放Ctrl键
		r.delay(100);
	}
}