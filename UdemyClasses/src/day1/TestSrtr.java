package day1;

public class TestSrtr {

	public static void main(String[] args) {
		
		String str="123sgthgf6";
		str=str.replaceAll("[^a-zA-Z]", "");
		System.out.println(str.trim());

	}

}
