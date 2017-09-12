package bank;

public class SavingAccount extends Account {
	@SuppressWarnings("unused")
	private double interestRate;

	public SavingAccount(double balance, double interest_rate) {
		super(balance);
		this.interestRate = interest_rate;
	}
}
