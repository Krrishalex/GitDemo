package day2;

public class NumberCheck {
	
	public static void checkNumber(int number) {
		if(number>0) {
			System.out.println("positive");
		}
		else if(number<0) {
			System.out.println("negative");
		}
		else {
			System.out.println("zero");
		}
	}

	public static void main(String[] args) {
		
		int a=0;
		checkNumber(a);
		
	}

}
