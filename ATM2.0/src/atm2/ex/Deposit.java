package atm2.ex;

public class Deposit extends Business {
	private double depositAmount;

	public Deposit(Account acc) {
		super(acc);
	}

	public double getDepositAmount() {
		return depositAmount;
	}

	public void setDepositAmount(double depositAmount) {
		this.depositAmount = depositAmount;
	}

	
	 public boolean deposit(double depositamount) {
	 super.getPendingAccount().setBalance(
	 super.getPendingAccount().getBalance() + depositamount);
	 return true;
	 }

//	@Override
//	public void execute() {
//		System.out.print("请输入您需要存入的金额:");
//		double am = scan.nextDouble();
//		this.getPendingAccount().setBalance(
//				this.getPendingAccount().getBalance() + am);
//		System.out.println("存款成功！");
//	}


}