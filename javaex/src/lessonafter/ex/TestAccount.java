package lessonafter.ex;

public class TestAccount {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Account user = new Account();
		user.setBalance(5000);
		user.setId(7701);
		System.out.println(user.getId());
		System.out.println(user.getBalance());
		System.out.println(user.withCreated(200));
		System.out.println(user.deppsit(36));
	}

}
