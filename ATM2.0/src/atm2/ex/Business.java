package atm2.ex;

public abstract class Business {
	private Account pendingAccount;

	public Business(Account bacc) {
		this.pendingAccount = bacc;
	}

	public Business() {
		// TODO Auto-generated constructor stub
	}

	public Account getPendingAccount() {
		return pendingAccount;
	}

	public void setPendingAccount(Account pendingAccount) {
		this.pendingAccount = pendingAccount;
	}

}