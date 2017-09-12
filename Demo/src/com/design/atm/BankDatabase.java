//数据库类，也是唯一能对账户进行直接访问的类
package com.design.atm;

public class BankDatabase {
	
		private Account accounts[];   //数据库中的所有账户
		
		//初始化，用于初始化数据库中的账号信息，包括账户号、密码、总额、可用余额
		public BankDatabase(){
			
				accounts=new Account[2];
				accounts[0]=new Account(99999,123456,1200.00,1000.00);
				accounts[1]=new Account(99995,23456,1000.00,1000.00);
		}
		
		//验证账户的正确性，即判断数据库中是否有该账号存在
		private Account getAccount(int accountNum){
				for(Account currentAccount:accounts){
					
						if(currentAccount.getAccountNum()==accountNum)
								return currentAccount;
				}
				return null;
		}
		
		//验证用户输入的账户和密码是否一致
		public boolean authenticate(int userAccountNum,int pin){
				Account userAccount=getAccount(userAccountNum);
				
				if(userAccount!=null)
						return userAccount.validatePIN(pin);
				else
					return false;
		}
		
		//获得账户中的可用余额
		public double getAvailableBalance(int userAccountNum){
				return getAccount(userAccountNum).getAvailableBalance();
		}
		
		//获得账户的总额
		public double getTotalBalance(int userAccountNum){
				
				return getAccount(userAccountNum).getTotalBalance();
		}
		
		//存款
		public void credit(int userAccountNum,double amount){
				getAccount(userAccountNum).credit(amount);
		}
		
		//取款
		public void debit(int userAccountNum,double amount){
				getAccount(userAccountNum).debit(amount);
		}
		

}
