package day3;

public class PrintPrimes {
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
		int p=1000;
		for (int i = 1; i <=p; i++) {
			
			boolean prime=isPrime(i);
			if(prime==true) {
				System.out.print(i+",");
			}
		}
	}

}
