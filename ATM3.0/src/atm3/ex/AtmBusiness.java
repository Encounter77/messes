package atm3.ex;

public abstract class AtmBusiness {

	private String cardNumber;
	private Screen screen;
	private SelfServise sel;
	
	public AtmBusiness(String cardNumber, Screen screen, SelfServise sel) {
		super();
		this.cardNumber = cardNumber;
		this.screen = screen;
		this.sel = sel;
	}
	
	
	public String getCardNumber() {
		return cardNumber;
	}


	public Screen getScreen() {
		return screen;
	}


	public SelfServise getSel() {
		return sel;
	}


	abstract public void operation();
}
