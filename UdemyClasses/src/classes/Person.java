package classes;

public class Person {
	
	public static void main(String[] args) {
		PersonDetails pd=new PersonDetails();
		pd.setAge(9);
		//pd.setFirstName("Krishna");
		//pd.setLastName("Reddy");
		
		System.out.println(pd.getFirstName());
		System.out.println(pd.getLastName());
		System.out.println(pd.isTeen());
		System.out.println(pd.getAge());
		System.out.println(pd.getFullName());
		
		
	}

}
