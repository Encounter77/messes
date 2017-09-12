package bank;

public class Bank {
	private Customer[] customers;
	private int numberOfCustomer;

	public Bank() {
		this.customers = new Customer[10];
		this.numberOfCustomer = 0;
	}

	public void addCustomer(String f, String l) {
		this.customers[numberOfCustomer] = new Customer(f, l);
		this.numberOfCustomer++;
	}

	public int getNumOfCustomers() {
		return numberOfCustomer;
	}

	public Customer getCustomer(int index) {
		return this.customers[index];
	}

}