package day2;

public class Test {

	public static void main(String[] args) {
		String str=" hero 98473 ";
		String str2=str.replaceAll("^a-zA-Z", "").trim();
		String first=str.trim();
		String str1="hero ";
		String second=str1.trim();
		if(first.equalsIgnoreCase(second)) {
			System.out.println("hello");
		}
		
	}
}
