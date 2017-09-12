package com.design.atm;

public class BalanceInquiry extends Transaction {

	public BalanceInquiry(int accountNum, Screen screen,
			BankDatabase bankDatabase) {
		super(accountNum, screen, bankDatabase);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
			BankDatabase bankDatabase=getBankDatabase();
			Screen screen=getScreen();
			
			double availableBalance=bankDatabase.getAvailableBalance(getAccountNum());
			
			double totalBalance=bankDatabase.getTotalBalance(getAccountNum());
			
			screen.displayMessageLine("The total Balance is "+totalBalance );
			screen.displayMessageLine("The available balance is "+availableBalance);
	}

}
