package banking;

public class Account {
	protected double balance;
	
	public Account(double init_balance){			//构造器，初始化余额
		balance = init_balance;
	}	
	
	public double getBalance() {
		return balance;
	}
	
	public boolean deposit(double amt){				//存入账户金额amt
		balance = balance+amt;
		return true;
	}
	
	public boolean withdraw(double amt){			//支出账户金额amt
		if(balance < amt){
			return false;
		}
		balance = balance-amt;
		return true;
	}
}
