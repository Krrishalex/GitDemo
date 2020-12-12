package day2;

public class DogBarking {
	
	
	public static void main(String[] args) {
		boolean a=true;
		int hourOfTheDay=-1;
		shouldWakeUp(a,hourOfTheDay);
		
	}
	
	
	public static void shouldWakeUp(boolean a, int hourOfTheDay){
		
		if(a==false && (hourOfTheDay>=8 && hourOfTheDay<=23)){
			System.out.println("dog is not barking");
		}
		else if(a==true &&(hourOfTheDay<8 && hourOfTheDay>22)) {
			System.out.println("true");
		}
		else if(a=true &&(hourOfTheDay>8 || hourOfTheDay<22)&&hourOfTheDay<0) {
			System.out.println("false");
		}
		
	}

}
