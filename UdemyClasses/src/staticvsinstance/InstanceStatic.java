package staticvsinstance;

public class InstanceStatic {
	
	private  String name;
	
	
	public InstanceStatic(String name) {
		this.name=name;
}
	
	public void printName() {
		
		System.out.println(name);
	}
	
	
	public static void main(String[] args) {
		InstanceStatic firstname=new InstanceStatic("krishna");
		InstanceStatic lastname=new InstanceStatic("reddy");
		
		firstname.printName();
		lastname.printName();
		
				
	}
}
