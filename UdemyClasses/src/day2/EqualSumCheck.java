package day2;

public class EqualSumCheck {
	
	public static void main(String[] args) {
		int n1=1,n2=2,n3=4;
		sumCheck(n1, n2, n3);
	}
	
	public static void sumCheck(int n1,int n2,int n3) {
		
		if(n3==n1+n2) {
			System.out.println("Equal");
		}
		else {
			System.out.println("not equal");
		}
	}

}
