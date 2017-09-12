//代表取款口的类
package com.design.atm;

public class CashDispenser {
		
		private final int INITIAL_COUNT=500;
		private int count;   //面值100的钱币的张数
		
		//构造函数，用于初始化
		public CashDispenser(){
				count=INITIAL_COUNT;
		}

		//当ATM中钱币数目足够时，从ATM中取钱
		public void dispenseCash(int amount){
				int billsRequired=amount/100;
				count-=billsRequired;
		}
		
		//判断ATM机中剩余的钱数是否足够,取的钱数必为100的倍数
		public boolean isSufficientCash(int amount){
			
				int billsRequired=amount/20;
				if(count>=billsRequired)
					return true;
				else
					return false;
		}		
}
