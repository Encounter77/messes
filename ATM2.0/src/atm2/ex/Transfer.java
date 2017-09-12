package atm2.ex;

import java.util.List;

public class Transfer extends Business {
	private List<Account> lis;

	public Transfer(Account acc, List<Account> lis) {
		super(acc);
		this.lis = lis; // 引用账户数据库
	}

	public List<Account> getLis() {
		return lis;
	}

	public void setLis(List<Account> lis) {
		this.lis = lis;
	}

	public Transfer() {
		// TODO Auto-generated constructor stub
	}

	public int transfercheck(String receivecardnumber) {
		int receiveindex = -1;
		for (int i = 0; i < lis.size(); i++) {
			if (lis.get(i).getCardNumber().equals(receivecardnumber)) {
				receiveindex = i;
				return receiveindex;
			}
		}
		return receiveindex;
	}

	public boolean transfer(int receiveindex, double transferamount) {
		if (super.getPendingAccount().getBalance() >= transferamount) {
			super.getPendingAccount().setBalance(
					super.getPendingAccount().getBalance() - transferamount);
			lis.get(receiveindex).setBalance(
					lis.get(receiveindex).getBalance() + transferamount);
			return true;
		}
		return false;
	}

	// @Override
	// public void execute() {
	// // TODO Auto-generated method stub
	// System.out.print("请输入您需要转入的账户卡号:");
	// String cn = scan.next();
	// for(int i=0;i<getLis().size();i++){
	// if(getLis().get(i).getCardNumber().equals(cn)){
	// System.out.print("账号卡号验证成功,请输入您需要转账的金额:");
	// double am = scan.nextDouble();
	// this.getPendingAccount().setBalance(getPendingAccount().getBalance()-am);
	// getLis().get(i).setBalance(getLis().get(i).getBalance()+am);
	// System.out.println("转账成功!");
	// }
	// }
	// System.out.println("对不起,你要转账的账户不存在.");
	// }
}