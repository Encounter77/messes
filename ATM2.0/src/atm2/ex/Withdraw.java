package atm2.ex;

public class Withdraw extends Business {
	private double withAmount;

	public Withdraw(Account acc) {
		super(acc);
	}

	public double getWithAmount() {
		return withAmount;
	}

	public void setWithAmount(double withAmount) {
		this.withAmount = withAmount;
	}

	public boolean withdraw(double withamount) {
		if (super.getPendingAccount().getBalance() >= withamount) {
			super.getPendingAccount().setBalance(
					super.getPendingAccount().getBalance() - withamount);
			return true;
		}
		return false;
	}

	public void withdrawmenu() {
		System.out.println("选择你需要取款的金额:");
		System.out.println("100");
		System.out.println("500");
		System.out.println("1000");
		System.out.println("2000");
		System.out.println("other");
		System.out.print("你选择的是:");
	}

	// @Override
	// public void execute() {
	// this.withdrawmenu();
	// this.setWithAmount(scan.nextDouble());
	// if (getPendingAccount().getBalance() >= getWithAmount()) {
	// this.getPendingAccount().setBalance(
	// getPendingAccount().getBalance() - withAmount);
	// System.out.println("取款成功！");
	// }else{
	// System.out.println("您的余额不足，无法完成取款操作！");
	// }
	// }
}