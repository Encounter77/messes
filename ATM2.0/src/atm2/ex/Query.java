package atm2.ex;

public class Query extends Business {

	public Query(Account pendingaccount) {
		super(pendingaccount);
	}

	public String displayAccountInformation() {
		return super.getPendingAccount().toString();
	}

//	@Override
//	public void execute() {
//		// TODO Auto-generated method stub
//		System.out.println(super.getPendingAccount().toString());
//	}

}
