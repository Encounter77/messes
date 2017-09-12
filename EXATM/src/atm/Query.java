package atm;

public class Query {

	public void queryMoney(Account user) {
		System.out.println("你当前金额是" + user.getBalance() + "元!");
	}
}
