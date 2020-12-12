package day1;

public class TEst {
	
public static void main(String[] args) {
	String text="wrete1, restee7, teusmfk11";
	String text1="gshhds sdjhdsjf ";
	String s[]=text.split(",");
	String s1;
	
	
	
	for (int i = 0; i < s.length; i++) {
		 s1=s[i].trim();
		 System.out.println(s1);
		 
		String num= s1.substring(s1.length()-2);
		 
		 System.out.println(num);
		int value= Integer.parseInt(num);
		if(value==11 || value==12) {
			int finalValue=value;
			System.out.println(finalValue);
		}
		else{
			//String fv=
			
		}
		
		System.out.println(text1.length());
		 }
	}
	
	
}



