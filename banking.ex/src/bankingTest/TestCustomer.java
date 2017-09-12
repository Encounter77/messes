package bankingTest;

import banking.Account;
import banking.Customer;

public class TestCustomer {

	public static void main(String[] args) {
	    Customer customer = null;
	    //Account  account = null;

	    // Create an account that can has a 500.00 balance.
	    //account = new Account(500);
	    System.out.println("Creating the customer Jane Smith.");
	    //code
	    customer = new Customer("Jane","Smith");
	    System.out.println("Creating her account with a 500.00 balance.");
	    //code
	    customer.setAccount(new Account(500));								//对象的交互,创建账户给Smith
	    //account = customer.getAccount();
	    System.out.println("Withdraw 150.00");
		//code
	    customer.getAccount().withdraw(150.00); 							//***
	    System.out.println("Deposit 22.50");
	  	//code
	    customer.getAccount().deposit(22.50);								//***
	    System.out.println("Withdraw 47.62");
	   	//code
	    customer.getAccount().withdraw(47.62);								//***
	    // Print out the final account balance
	    System.out.println("Customer [" + customer.getLastName()
			       + ", " + customer.getFirstName()
			       + "] has a balance of " + customer.getAccount().getBalance());
	  }
}

