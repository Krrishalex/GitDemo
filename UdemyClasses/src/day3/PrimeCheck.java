package day3;

public class PrimeCheck {
	
	public static boolean isPrime(int n) {
		
		if(n==1) {
			return false;
		}
		
		for(int i=2; i<=n/2; i++) {
			
			if(n%i==0) {
				return false;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		
		int p=5;
		int count=0;
		//System.out.println(isPrime(p));
		
		for (int i = 1; i <= p; i++) {
			
			boolean b=isPrime(i);
			if(b==true) {
				count++;
			}
			
			if(count==3) {
				System.out.println("3");
				break;
			}
		}
		

	}
	
	
	

}
