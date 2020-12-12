package day2;

public class SpeedConverter {
	
	public static void main(String[] args) {
		double kms=0.55d;
		
	long miles=	toMilesPerHour(kms);
	System.out.println(miles);
		
	}
	
	
	public static long toMilesPerHour(double kilometersPerHour) {
		
		long miles=(long)(0.621371 * kilometersPerHour);
		miles=Math.round(miles);
		
		if(miles>0) {
			return miles;
		}
		else {
			return -1;
		}
		
		
		
	}
	

}
