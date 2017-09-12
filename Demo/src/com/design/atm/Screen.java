//代表ATM机的屏幕
package com.design.atm;

public class Screen {
	
	//用于在屏幕上显示一行信息(无换行)
	public void displayMessage(String message){
		
			System.out.print(message);
	}
	
	//用于在屏幕上显示一行信息(有换行)	
	public void displayMessageLine(String message){
		
			System.out.println(message);
	}
	
	//用于在屏幕显示金额
	public void displayRenminBi(double amount){
		
			System.out.print("￥"+amount);
	}
	
	
	
	

}
