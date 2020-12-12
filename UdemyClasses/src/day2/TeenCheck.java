package day2;

public class TeenCheck {
	
	public static void main(String[] args) {
		
		int n1=15,n2=25,n3=45;
		
		System.out.println(teenCheck(n1,n2,n3));
	}
	
	public static boolean teenCheck(int n1,int n2,int n3) {
		
		if((n1>=13 && n1<=19)||(n2>=13 && n2<=19)||(n3>=13 && n3<=19)) {
			
			return true;
			
		}
		else {
			return false;
			
		}
		
	}

}
