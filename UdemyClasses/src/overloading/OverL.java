package overloading;

public class OverL {
	
	public static int add(int a, int b) {
		return a+b;
		

	}
	
	public static double add(double a,double b){
		return a+b;
	}
	public static String name(String firstname,String lastname) {
		return firstname+lastname;
	}
	public static void main(String[] args) {
		System.out.println(OverL.add(4.00, 5.09));
		System.out.println(OverL.add(78, 98));
		System.out.println(OverL.name("Krishna", "Reddy"));
	}
	

}
