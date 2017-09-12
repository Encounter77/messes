package atm2.ex;

import java.util.ArrayList;
import java.util.List;

public class BankDB {
	private List<Account> list;

	public BankDB() {
		list = new ArrayList<Account>();
		Account acc1 = new Account("201501", "101", "liuzhuang", 500);
		Account acc2 = new Account("201502", "102", "zhangsan", 1500);
		Account acc3 = new Account("201503", "103", "lisi", 4500);
		Account acc4 = new Account("201504", "104", "wangwu", 78500);
		Account acc5 = new Account("201505", "105", "zhaoliu", 50);

		list.add(acc1);
		list.add(acc2);
		list.add(acc3);
		list.add(acc4);
		list.add(acc5);
	}

	public List<Account> getList() {
		return list;
	}

	public void setList(List<Account> list) {
		this.list = list;
	}

}
