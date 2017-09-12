package ex;

public class Account {
	private String id;
	private String number;
	private String passWord;
	private double balance;

	public Account(String id, String number, String passWord, double balance) {
		super();
		this.id = id;
		this.number = number;
		this.passWord = passWord;
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", number=" + number + ", balance="
				+ balance + "]";
	}

}