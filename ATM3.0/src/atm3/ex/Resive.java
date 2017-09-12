package atm3.ex;

public class Resive extends AtmBusiness {
	private Keypad keypad;
	private String newPassWord;
	private boolean resiveResult;

	public Resive(String cardNumber, Screen screen, SelfServise sel,
			Keypad kaypad) {
		super(cardNumber, screen, sel);
		this.keypad = kaypad;
		this.newPassWord = null;
		this.resiveResult = false;
	}

	@Override
	public void operation() {
		SelfServise seln = super.getSel();
		Screen scr = super.getScreen();
		scr.displayMessage("请输入您的新密码:");
		newPassWord = keypad.getInput();
		scr.displayMessage("请再次输入您的新密码:");
		String cs = keypad.getInput();
		resiveResult = newPassWord.equals(cs);
		if (resiveResult) {
			seln.accessAccount(getCardNumber()).setCardPassword(newPassWord);
			scr.displayMessageLine("修改密码成功");
		} else {
			scr.displayMessageLine("您两次输入的密码不相同,操作取消!");
		}
	}
}