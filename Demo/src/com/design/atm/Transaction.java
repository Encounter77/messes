//事务类，抽象类，是BalanceInquiry、Deposit和Withdrawal的父类
package com.design.atm;

public  abstract class Transaction {
		
		private int accountNum;                      //账户号
		private Screen screen;                         //用于输出的屏幕
		private BankDatabase bankDatabase;  //银行数据库，以便操作账户类下的对象
	
		//以下为成员变量的getter方法
		public int getAccountNum() {
			return accountNum;
		}
		
		public Screen getScreen() {
			return screen;
		}
		
		public BankDatabase getBankDatabase() {
			return bankDatabase;
		}

		//构造方法,对事务进行初始化，包括执行事务的账号，显示信息的屏幕和对应的数据库，子类的构造函数将继承该构造函数
		public Transaction(int accountNum, Screen screen,
				BankDatabase bankDatabase) {
			this.accountNum = accountNum;
			this.screen = screen;
			this.bankDatabase = bankDatabase;
		}
		
		//虚方法execute
		abstract public void execute();	
		
}
