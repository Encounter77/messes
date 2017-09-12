package banking;

public class CheckingAccount extends Account{
	private double overdraftProtection;
	
	public CheckingAccount(double balance) {
		super(balance);
	}
	
	public CheckingAccount(double balance,double protect) {
		super(balance);
		this.overdraftProtection = protect;
	}
	
	@Override
	public boolean withdraw(double amt) {
		if(balance>amt){
			balance = balance - amt;
			return true;
		}else if(overdraftProtection>=amt-balance){
			balance = balance - amt;
			return true;
		}else{
			return false;
		}
	}
}
