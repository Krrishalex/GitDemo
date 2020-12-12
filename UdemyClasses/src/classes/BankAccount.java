package classes;

public class BankAccount {
	
	private int accountNumber;
	private int balance;
	private String customerName;
	private String email;
	private String phoneNumber;
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public int getBalance() {
		
	return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public int deposit(int bal) {
		balance=balance+bal;
		return bal;
	}
	public String withdraw(int bal) {
		if(balance<bal) {
			return "no enough funds current balance is:"+balance;
		}
		else {
		balance=balance-bal;
		return "Succesfully withdrwan "+bal+" amount";
		}
	}
}
