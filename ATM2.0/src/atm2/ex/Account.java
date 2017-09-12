package atm2.ex;

public class Account {
	private String cardNumber;
	private String cardPassword;
	private String cardHolderName;
	private double balance;

	public Account(String cardNumber, String cardPassword,
			String cardHolderName, double balance) {
		super();
		this.cardNumber = cardNumber;
		this.cardPassword = cardPassword;
		this.cardHolderName = cardHolderName;
		this.balance = balance;
	}

	public Account() {
		// TODO Auto-generated constructor stub
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardPassword() {
		return cardPassword;
	}

	public void setCardPassword(String cardPassword) {
		this.cardPassword = cardPassword;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [cardNumber=" + cardNumber + ", cardHolderName="
				+ cardHolderName + ", balance=" + balance + "]";
	}
}
