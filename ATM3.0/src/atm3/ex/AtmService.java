package atm3.ex;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class AtmService {
	private String pendingAccountNumber;
	private SelfServise sel;
	private Screen screen;
	private Keypad keypad;
	private boolean userAuthenticated; // 用户是否已通过验证
	private static final int FLAG = 777;

	public AtmService() {
		pendingAccountNumber = null;
		sel = new SelfServise();
		screen = new Screen();
		keypad = new Keypad();
		userAuthenticated = false;
	}

	public void display() {
		screen.displayMessageLine("\t\t------欢迎使用------");
	}

	public int atmMenu() {
		screen.displayMessageLine("\t请选择您需要的操作:");
		screen.displayMessageLine("\t1.查询账户信息及余额");
		screen.displayMessageLine("\t2.存款");
		screen.displayMessageLine("\t3.取款");
		screen.displayMessageLine("\t4.转账");
		screen.displayMessageLine("\t5.修改密码");
		screen.displayMessageLine("\t6.退出");
		screen.displayMessage("请选择:");
		return keypad.getChoice();
	}

	public void login() {
		screen.displayMessage("\t请输入您的卡号:");
		String sn = keypad.getInput();
		screen.displayMessage("\t请输入您的密码:");
		String pw = keypad.getInput();
		userAuthenticated = sel.loginCheck(sn, pw);
		if (userAuthenticated) {
			pendingAccountNumber = sn;
		} else {
			screen.displayMessageLine("\t登陆失败,您的账号或密码有误,请重新输入!");
		}
	}

	public void work() throws AWTException {
		int cnt = 0;
		display();
		do {
			cnt++;
			login();
			if (userAuthenticated) {
				cnt = FLAG;
			}
		} while (cnt < 3);
		if (cnt == 3) {
			screen.displayMessageLine("\t很抱歉,您已经连续三次输入有误,本机不能继续再为您进行服务,谢谢您的使用.");
			work();
		}
		clear();
		screen.displayMessageLine("\t您好,"
				+ sel.accessAccount(pendingAccountNumber).getCardHolderName()
				+ "!");
		AtmBusinessWork();
	}

	private void AtmBusinessWork() throws AWTException {
		AtmBusiness abus = null;
		char c;
		do {
			int choice = atmMenu();
			switch (choice) {
			case 1:
				abus = new Query(pendingAccountNumber, screen, sel);
				abus.operation();
				break;
			case 2:
				abus = new Deposit(pendingAccountNumber, screen, sel, keypad);
				abus.operation();
				break;
			case 3:
				abus = new Withdraw(pendingAccountNumber, screen, sel, keypad);
				abus.operation();
				break;
			case 4:
				abus = new Transfer(pendingAccountNumber, screen, sel, keypad);
				abus.operation();
				break;
			case 5:
				abus = new Resive(pendingAccountNumber, screen, sel, keypad);
				abus.operation();
				break;
			case 6:
				screen.displayMessageLine("\t请勿忘记取走您的卡片!"+"\n"+"\t谢谢您的使用,再见！");
				break;
			}
			if (choice != 6) {
				screen.displayMessage("\t您是否还继续进行操作？(Y/N)");
				c = keypad.getInput().charAt(0);
				if (c == 'N') {
					screen.displayMessageLine("\t请勿忘记取走您的卡片!"+"\n"+"\t谢谢您的使用,再见！");
					work();
				}
				clear();
			} else {
				work();
			}
		} while (true);
	}

	// 清屏机器人
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