package classes;

public class PersonDetails {
	
	private String firstName;
	private String lastName;
	private int age;
	//private boolean isTeen;	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isTeen() {
		if(age>=8 && age<=20) {
			return true;
		}
		return false;
	}
	public String getFullName() {
		if(firstName.length()==0 && lastName.length()==0) {
			return null;
		}
		else if(firstName.length()==0) {
			return lastName;
		}
		else if(lastName.length()==0){
			return firstName;
		}
		else {
			return firstName+" "+lastName;
		}
	}

}
