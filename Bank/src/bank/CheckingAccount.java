package bank;

public class CheckingAccount extends Account {
	private double overdraftProtection;
	@SuppressWarnings("unused")
	private SavingAccount protectedBy = null;

	public CheckingAccount(double balance) {
		super(balance);
	}

	public CheckingAccount(double balance, double protect) {
		super(balance);
		this.overdraftProtection = protect;
	}

	public boolean withdraw(double amt) {
		if (amt > super.balance) {
			if (this.overdraftProtection >= (amt - super.balance)) {
				super.balance = 0;
				this.overdraftProtection -= (amt - this.balance);
				return true;
			}
			return false;
		} else {
			super.balance -= amt;
			return true;
		}
	}
}
