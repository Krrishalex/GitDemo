package day3;

public class SumOdd {
	
	public static int isOdd(int f1,int l1) {
		int sum=0;
		if(f1>0 && l1>0) {
			for (int i=f1; i <=l1; i++) {
				if(i%2!=0) {
					sum=sum+i;
				}
				
			}
		return sum;	
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		int f1=-1,l1=100;
		
		System.out.println(isOdd(f1,l1));
		

	}

}
