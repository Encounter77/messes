package atm3.ex;

public class Query extends AtmBusiness {

	public Query(String cardNumber, Screen screen, SelfServise sel) {
		super(cardNumber, screen, sel);
	}

	@Override
	public void operation() {
		SelfServise seln = super.getSel();
		Screen scr = super.getScreen();
		scr.displayMessageLine(seln.accessAccount(getCardNumber()).toString());
	}
}
