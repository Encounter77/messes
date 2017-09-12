package atm3.ex;

public class Deposit extends AtmBusiness {
	private double depositAmount;
	private Keypad keypad;

	public Deposit(String cardNumber, Screen screen, SelfServise sel,Keypad keypad) {
		super(cardNumber, screen, sel);
		this.depositAmount = 0;
		this.keypad = keypad;
	}

	@Override
	public void operation() {
		SelfServise seln = super.getSel();
		Screen scr = super.getScreen();
		scr.displayMessage("请输入您要存入的金额:");
		depositAmount = keypad.getAmount();
		seln.accessAccount(getCardNumber()).deposit(depositAmount);
		scr.displayMessageLine("存款成功!");
	}
}
