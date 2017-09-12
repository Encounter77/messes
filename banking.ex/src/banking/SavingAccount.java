package banking;

public class SavingAccount extends Account{
	private double interesrRate;
	
	public SavingAccount(double balance,double init_rate) {
		super(balance);
		this.interesrRate = init_rate;
	}
}
