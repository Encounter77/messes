package com.design.atm;

public class Account {

	private int accountNum; // 账户号
	private int pin; // 密码
	private double totalBalance; // 总额
	private double availableBalance; // 可用余额

	// 构造函数初始化
	public Account(int accountNum, int pin, double totalBalance,
			double availableBalance) {
		super();
		this.accountNum = accountNum;
		this.pin = pin;
		this.totalBalance = totalBalance;
		this.availableBalance = availableBalance;
	}

	// 验证用户密码
	public boolean validatePIN(int pinNum) {

		if (pin == pinNum)
			return true;
		else
			return false;
	}

	// 成员变量的getter方法
	public int getAccountNum() {
		return accountNum;
	}

	public double getTotalBalance() {
		return totalBalance;
	}

	public double getAvailableBalance() {
		return availableBalance;
	}

	// 存款方法
	public void credit(double amount) {
		totalBalance += amount;
	}

	// 取款方法
	public void debit(double amount) {
		totalBalance -= amount;
		availableBalance -= amount;
	}

}