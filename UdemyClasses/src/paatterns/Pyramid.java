package paatterns;

public class Pyramid {
	
	public static void main(String[] args) {
		
		int lines=10;
		int slines=-1;
		for (int i = 0; i <=lines; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");	
			}
			System.out.println();
			slines++;
			
		}
		
		if(slines==lines) {
			
			for (int i = 0; i <=slines; i++) {
			
				for (int j = slines-1; j >i; j--) {
					System.out.print("* ");
				}
				System.out.println();
			}
		}
	}

}
