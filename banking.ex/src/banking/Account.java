package banking;

public class Account {
	protected double balance;
	
	public Account(double init_balance){			//����������ʼ�����
		balance = init_balance;
	}	
	
	public double getBalance() {
		return balance;
	}
	
	public boolean deposit(double amt){				//�����˻����amt
		balance = balance+amt;
		return true;
	}
	
	public boolean withdraw(double amt){			//֧���˻����amt
		if(balance < amt){
			return false;
		}
		balance = balance-amt;
		return true;
	}
}
