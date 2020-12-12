package day3;

public class SwitchDay {
	
	
	public static void dayOfTheWeek(String day) {
		
		
		switch(day.toLowerCase()) {
		case "sun":
			System.out.println("SUNDAY");
			break;
		case "mon":
			System.out.println("MONDAY");
			break;
		case "tue":
			System.out.println("TUESDAY");
			break;
		case "wed":
			System.out.println("WEDNESDAY");
			break;
		case "thu":
			System.out.println("THURSDAY");
			break;
		case "fri":
			System.out.println("FRIDAY");
			break;
		case "sat":
			System.out.println("SATURDAY");
			break;
		default:
			System.out.println("not found");
		}
	}

	public static void main(String[] args) {
		
		String day="sun";
		
		dayOfTheWeek(day);
	}

}
