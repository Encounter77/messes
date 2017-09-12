package atm3.ex;

public class Withdraw extends AtmBusiness {
	private double withdrawAmount;
	private Keypad keypad;

	public Withdraw(String cardNumber, Screen screen, SelfServise sel,
			Keypad keypad) {
		super(cardNumber, screen, sel);
		this.withdrawAmount = 0;
		this.keypad = keypad;
	}

	@Override
	public void operation() {
		SelfServise seln = super.getSel();
		Screen scr = super.getScreen();
		scr.displayMessageLine("tip:取款金额必须是100的整数倍且单笔取款总金额不得超过2000元！");
		scr.displayMessage("请输入您需要取出的金额:");
		withdrawAmount = keypad.getAmount();
		while (withdrawAmount % 100 != 0 || withdrawAmount > 2000) {
			scr.displayMessage("您输入的取款金额不符合要求,请重新输入:");
			withdrawAmount = keypad.getAmount();
		}
		if (seln.accessAccount(getCardNumber()).getBalance() >= withdrawAmount) {
			seln.accessAccount(getCardNumber()).withdraw(withdrawAmount);
			scr.displayMessageLine("取款成功!");
		} else {
			scr.displayMessageLine("您的账户余额不足,取款失败!");
		}
	}
}
