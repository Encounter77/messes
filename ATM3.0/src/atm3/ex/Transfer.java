package atm3.ex;

public class Transfer extends AtmBusiness {
	private Keypad keypad;
	private String receivecardNumber;
	private double transferAmount;
	private boolean accountExist;

	public Transfer(String cardNumber, Screen screen, SelfServise sel,
			Keypad keypad) {
		super(cardNumber, screen, sel);
		this.keypad = keypad;
		this.receivecardNumber = null;
		this.transferAmount = 0;
		this.accountExist = false;
	}

	@Override
	public void operation() {
		SelfServise seln = super.getSel();
		Screen scr = super.getScreen();
		scr.displayMessage("请输入您要转入的账户卡号:");
		this.receivecardNumber = keypad.getInput();
		Account oacc = seln.accessAccount(receivecardNumber);
		if (oacc != null) {
			accountExist = true;
		}
		while (!accountExist) {
			scr.displayMessage("您输入的账号不存在,请重新输入:");
			this.receivecardNumber = keypad.getInput();
			Account noacc = seln.accessAccount(receivecardNumber);
			if (noacc != null) {
				oacc = noacc;
				accountExist = true;
			} else {
				accountExist = false;
			}
		}
		scr.displayMessage("账号卡号验证成功,您转账的账户持卡人为"+oacc.getCardHolderName()+"。\n请输入转账金额:");
		transferAmount = keypad.getAmount();
		if (seln.accessAccount(getCardNumber()).getBalance() >= transferAmount) {
			seln.accessAccount(getCardNumber()).withdraw(transferAmount);
			seln.accessAccount(receivecardNumber).deposit(transferAmount);
			scr.displayMessageLine("转账成功!");
			System.out.println(seln.accessAccount(getCardNumber()).toString());
			System.out
					.println(seln.accessAccount(receivecardNumber).toString());
		} else {
			System.out.println("您的账户余额不足,账户转账失败!");
		}
	}
}