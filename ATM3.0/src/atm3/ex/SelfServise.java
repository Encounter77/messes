 package atm3.ex;

import java.util.ArrayList;
import java.util.List;

public class SelfServise {
	private List<Account> list;

	public SelfServise() {
		list = new ArrayList<Account>();
		Account acc1 = new Account("201501", "101", "liuzhuang", 0);
		Account acc2 = new Account("201502", "102", "zhangsan", 1500);
		Account acc3 = new Account("201503", "103", "lisi", 4500);
		Account acc4 = new Account("201504", "104", "wangwu", 78500);
		Account acc5 = new Account("201505", "105", "zhaoliu", 500);
		Account acc6 = new Account("201506","106","姜燕飞",8000000);

		list.add(acc1);
		list.add(acc2);
		list.add(acc3);
		list.add(acc4);
		list.add(acc5);
		list.add(acc6);
	}

	public List<Account> getList() {
		return list;
	}

	public void setList(List<Account> list) {
		this.list = list;
	}

	public Account accessAccount(String cn){
		for(Account acc:list){
			if(acc.getCardNumber().equals(cn)){
				return acc;
			}
		}
		return null;
	}
	
	public boolean loginCheck(String cn,String pw){
		Account cacc = accessAccount(cn);
		if(cacc!=null){
			if(cacc.getCardPassword().equals(pw)){
				return true;	
			}
		}
		return false;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SelfServise other = (SelfServise) obj;
		if (list == null) {
			if (other.list != null)
				return false;
		} else if (!list.equals(other.list))
			return false;
		return true;
	}
}
