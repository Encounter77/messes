package atm;

import java.util.Scanner;

public class ATM {
	private Account account;

	public ATM() {
		account = new Account();
		account.setName("123456");
		account.setPassword("123456");
		account.setBalance(5000);
	}

	// ����ATM
	public void run() {
		this.welcome();
		int num = 0;		// ��������Ϊ��½�������������ܳ���3��
		while (num < 3) {	// ���ε�½����
			num++;
			boolean flag = this.login();	
			if (flag) {
				System.out.println("��ӭ��," + account.getName()+"!");
				while (true) {
					int choice = this.item();
					switch (choice) {
					case 1:
						Query query = new Query();
						query.queryMoney(account);
						break;
					case 2:
						Deposit deposit = new Deposit();
						deposit.storeMoney(account);
						break;
					case 3:
						Withdraw withdraw = new Withdraw();
						withdraw.getMoney(account);
						break;
					case 4:
						Resive resive = new Resive();		
						resive.changePassWord(account);
						break;
					default:
						exit();
						break;
					}
				}
			} else {
				System.out.println("��½ʧ��,���Ŀ��Ż���������!");
				if (num == 3) {
					System.out.println("���Ѿ����������������,����������Ϊ������,лл����ʹ�ã�");
				}
			}
		}
	}

	// ѡ�����
	public int item() {
		Scanner scan = new Scanner(System.in);
		System.out.println("��ѡ����Ҫ������ѡ��");
		System.out.println("1.��ѯ");
		System.out.println("2.��Ǯ");
		System.out.println("3.ȡǮ");
		System.out.println("4.�޸�����");
		System.out.println("5.ת��");
		System.out.println("6.�˳�");
		System.out.println();
		System.out.print("��ѡ��");
		int choice = scan.nextInt();
		return choice;
	}

	public void welcome() {
		System.out.println("*****��ӭʹ���ҵ�ATM*****");
	}

	public void exit() {
		System.out.println("лл���ʹ�ã��ټ���");
		System.exit(0);
	}

	//��¼��֤
	public boolean login() {
		Scanner scan = new Scanner(System.in);
		System.out.print("�������û�����");
		String name = scan.nextLine();
		System.out.print("���������룺");
		String password = scan.nextLine();
		if (name.equals(account.getName())
				&& password.equals(account.getPassword())) {
			return true;
		}
		return false;
	}
}