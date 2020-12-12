package paatterns;

public class StarsTrio {

	public static void main(String[] args) {
		
		int lines=6;
		int goal=5;
		for (int i = 0; i < lines; i++) {
			
			for (int j = goal; j >i; j--) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
		

	}

}
