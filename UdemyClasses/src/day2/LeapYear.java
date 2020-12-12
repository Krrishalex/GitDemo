package day2;

public class LeapYear {

	public static void main(String[] args) {
		
		int year=1884;
		isLeapYear(year);

	}
	
	
	public static void isLeapYear(int year) {
		
		if(year>1 && year<9999) {
		if(year%400==0) {
			System.out.println("Leap year");
		}
		
		else if(year%100==0) {
			System.out.println("not Leap year");
		}
		else if(year%4==0) {
			System.out.println("Leap year");
		}
		
	}
	}

}
