package bank;

public class Customer {
	private String firstName;
	private String lastName;
	private Account[] accounts = new Account[10];
	private int accountOfNumber = 0;

	public Customer(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Account getAccount(int i) {
		return accounts[i];
	}

	public void setAccount(Account acct, int i) {
		this.accounts[i] = acct;
	}

	public void addAccount(Account account) {
		this.accounts[accountOfNumber] = account;
		accountOfNumber++;
	}

	public int getNumOfAccounts() {
		return this.accountOfNumber;
	}
}
