package constructors;

public class VipCustomer {
	
	private String name;
	private double creditLimit;
	private String email;
	
	
	public VipCustomer() {
		this("defaultName",30.45d,"defaultmail");
	}


	public VipCustomer(String name, double creditLimit, String email) {
		this.name=name;
		this.creditLimit=creditLimit;
		this.email=email;
	}
	
	public VipCustomer(String name,double creditLimit) {
		this("name",45.30d,"defaultValue");
	}


	public String getName() {
		return name;
	}


	public double getCreditLimit() {
		return creditLimit;
	}


	public String getEmail() {
		return email;
	}
	
}
