package lessonafter.ex;

public class Account {
	private int id=7;
	private double balance=2000;
	private java.util.Date dateCreated;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(java.util.Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Account(){
		
	}
	
	public double withCreated(double price){
		 balance=balance-price; 
		 return balance;
	}
	
	public double deppsit(double price){
		balance = balance+price;
		return balance;
	}
}
