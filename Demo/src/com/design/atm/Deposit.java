//类Transaction的子类之一：用于存款事务
package com.design.atm;

public class Deposit extends Transaction {
		
		private double amount;
		private Keypad keypad;
		private DepositSlot depositSlot;
		public final static int CANCELED=0;
	
		public Deposit(int accountNum, Screen screen, BankDatabase bankDatabase,
								Keypad atmKeypad,DepositSlot atmDepositSlot) {
			super(accountNum, screen, bankDatabase);              //继承父类的构造方法
			// TODO Auto-generated constructor stub
			keypad=atmKeypad;                                                 //对自己特有的成员变量进行初始化
			depositSlot=atmDepositSlot;                                       
		}
	
		@Override
		public void execute() {
			// TODO Auto-generated method stub
			
			BankDatabase bankDatabase=getBankDatabase();
			Screen screen=getScreen();
			
			amount=promptInput();
			
			if(amount!=CANCELED){
				
					screen.displayMessageLine("please insert "+amount+" money");
					
					boolean envelopReceived=depositSlot.isEnvelopeReceived();
					
					if(envelopReceived){
							screen.displayMessageLine("has been received");
							bankDatabase.credit(getAccountNum(), amount);							
					}
					else{
						    screen.displayMessageLine("has not been received");
					}

			}
			else
				screen.displayMessageLine("has  been canceled");	
		}
		
		private double promptInput(){
				Screen screen=getScreen();
				
				screen.displayMessageLine("enter a deposit amount");
				
				int input=keypad.getInput();
				
				if(input==CANCELED)
					return CANCELED;
				else
					return (double)input;
		}
	

}
