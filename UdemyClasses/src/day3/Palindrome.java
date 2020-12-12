package day3;

public class Palindrome {
	
	public static boolean isPalindrome(int n) {
		int temp=n;
		int rev=0;
		while(temp>0) {
			
			int rem=temp%10;
			rev=rev+rem*10;
			temp=temp/10;
			
		}
		if(rev==n) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		int n=343;
		System.out.println(isPalindrome(n));
		
	}

}
