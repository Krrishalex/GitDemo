package classes;

public class Bank {

	public static void main(String[] args) {
		
		BankAccount ba=new BankAccount();
		ba.setAccountNumber(1011);
		ba.setBalance(1200);
		ba.setCustomerName("Krishna");
		ba.setEmail("test@mail.com");
		ba.setPhoneNumber("+91-9874563210");
		
		System.out.println("Deposit amount : "+ba.deposit(200));
		System.out.println("Current balance :"+ba.getBalance());
		System.out.println(ba.withdraw(2000));
		System.out.println("Current balance:"+ba.getBalance());
	}

}
