package com.design.atm;

public class ATM {

	private boolean userAuthenticated; // 用户是否已通过验证
	private int currentAccountNumber; // 当前 用户账号
	private Screen screen; // ATM机的屏幕
	private Keypad keypad; // ATM机的键盘
	private CashDispenser cashDispenser; // ATM机的取款口
	private DepositSlot depositSlot; // ATM机的存款口
	private BankDatabase bankDatabase; // 账户信息数据库

	// 主菜单操作代码
	private static final int BALANCE_INQUIRY = 1;
	private static final int WITHDRAWL = 2;
	private static final int DEPOSIT = 3;
	private static final int EXIT = 4;

	// 无参的构造函数，用于对以上成员变量进行初始化
	public ATM() {
		userAuthenticated = false;
		currentAccountNumber = 0;
		screen = new Screen();
		keypad = new Keypad();
		cashDispenser = new CashDispenser();
		depositSlot = new DepositSlot();
		bankDatabase = new BankDatabase();
	}

	// 启动ATM
	public void run() {
		// 用户欢迎界面；事务执行界面
		while (true) {
			while (!userAuthenticated) {
				screen.displayMessageLine("Welcome!"); // 欢迎信息
				authenticate(); // 验证用户信息
			}

			performTransactions();
			userAuthenticated = false;
			currentAccountNumber = 0;
			screen.displayMessageLine("Thank you,88!");

		}
	}

	public void authenticate() {

		screen.displayMessageLine("Please input your account number:");
		int accountNumber = keypad.getInput(); // 输入账户名

		screen.displayMessageLine("Please input your PIN：");// 输入密码
		int pin = keypad.getInput();

		userAuthenticated = bankDatabase.authenticate(accountNumber, pin);

		if (userAuthenticated)
			currentAccountNumber = accountNumber;
		else
			screen.displayMessageLine("Invalid account Number or pin,please try again!");

	}

	private void performTransactions() {

		Transaction currentTransaction = null;

		boolean userExited = false;

		while (!userExited) {
			int mainMenuSelection = displayMainMenu();

			switch (mainMenuSelection) {
			case BALANCE_INQUIRY:
			case WITHDRAWL:
			case DEPOSIT:
				currentTransaction = createTransaction(mainMenuSelection);
				currentTransaction.execute();
				break;
			case EXIT:
				userExited = true;
				break;
			default:
				screen.displayMessageLine("You entered an invalid selection, please try again!");
				break;
			}
		}
	}

	private Transaction createTransaction(int type) {

		Transaction temp = null;
		switch (type) {
		case BALANCE_INQUIRY:
			temp = new BalanceInquiry(currentAccountNumber, screen,
					bankDatabase);
			break;
		case WITHDRAWL:
			temp = new Withdrawl(currentAccountNumber, screen, bankDatabase,
					keypad, cashDispenser);
			break;
		case DEPOSIT:
			temp = new Deposit(currentAccountNumber, screen, bankDatabase,
					keypad, depositSlot);
			break;

		}

		return temp;
	}

	private int displayMainMenu() {

		screen.displayMessageLine("Welcome!");
		screen.displayMessageLine("1:View my balance");
		screen.displayMessageLine("2:Withdraw cash");
		screen.displayMessageLine("3:Deposit cash");
		screen.displayMessageLine("4:Exit");
		screen.displayMessageLine("Please Enter a choice");

		return keypad.getInput();
	}

}