//类Transaction的子类之一：用于表示取款事务
package com.design.atm;

public class Withdrawl extends Transaction {
	
	private int amount;
	private Keypad keypad;
	private CashDispenser cashDispenser;

	private final static int CANCELED=5;
	public Withdrawl(int accountNum, Screen screen, BankDatabase bankDatabase,
			                    Keypad keyPad,CashDispenser cashdispenser) {
		super(accountNum, screen, bankDatabase);
		// TODO Auto-generated constructor stub
		keypad=keyPad;
		cashDispenser=cashdispenser;		
	}
	

//重载Transaction类的execute方法	
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		
		boolean cashDispensed=false;
		double availableBalance;
		
		BankDatabase bankDatabase=getBankDatabase();  //数据库将通过父类的getter方法获得
		Screen screen=getScreen();                                   //屏幕也同上
		
		do{
			
			   amount=displayMenuOfAmounts();
			   //用户输入了有效的金额
			   if(amount!=CANCELED){
				   //获得该账户的可用余额(账号将继承父类的账号属性，通过父类的getter方法获得)
				   availableBalance=bankDatabase.getAvailableBalance(getAccountNum());
				   
				   //如果可用余额>=取款金额,则通过数据库对账户进行操作
				   if(amount<=availableBalance){
					   
					   	if(cashDispenser.isSufficientCash(amount)){
					   			
					   			bankDatabase.debit(getAccountNum(), amount);
					   			cashDispenser.dispenseCash(amount);
					   			cashDispensed=true;
					   			
					   			screen.displayMessageLine("Your cash has been dispensed");					   			
					   	}
					   	else
					   		screen.displayMessageLine("Insufficient cash in ATM");					   				   		
				   }
				   else
					   	screen.displayMessageLine("Insufficient cash in your account");
			   }
			   else{
				   screen.displayMessageLine("you have canceled");//用户取消了取款操作
				   return;
			   }
		}while(!cashDispensed);
	}
	
	
	//显示取款时ATM机的界面显示，提示用户输入取款金额，并返回该金额
	private int displayMenuOfAmounts(){
			
			int userChoice=0;
			
			Screen screen=getScreen();
			
			int amounts[]={0,100,200,300,500};
			
			while(userChoice==0){
				
				screen.displayMessageLine("Menu");
				screen.displayMessageLine("1:100");
				screen.displayMessageLine("2:200");				
				screen.displayMessageLine("3:500");
				screen.displayMessageLine("4:1000");
				screen.displayMessageLine("5:Cancel");
				
				int input=keypad.getInput();
				
				switch(input){
				case 1:
				case 2:
				case 3:
				case 4:
					userChoice=amounts[input];
					break;
				case CANCELED:
					userChoice=CANCELED;
					break;
				default:
					screen.displayMessageLine("Try again!");
					break;
				}
				
			}
			return userChoice;
	}
}
