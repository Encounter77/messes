package atm2.ex;

public class Revise extends Business {
	
	public Revise(Account acc) {
		super(acc);
	}

	public boolean revisepassword(String newpassword) {
		super.getPendingAccount().setCardPassword(newpassword);
		return true;
	}

//	@Override
//	public void execute() {
//		// TODO Auto-generated method stub
//		
//	}
}
