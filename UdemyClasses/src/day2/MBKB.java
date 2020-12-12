package day2;

public class MBKB {
	
	public static void main(String[] args) {
		int kb=-4096;
		
		printMegaBytesAndKiloBytes(kb);
	}
	
	public static void printMegaBytesAndKiloBytes(int kilobytes) {
		
		if(kilobytes>0) {
			int mb=kilobytes/1024;
			int kb=kilobytes%1024;
			
			System.out.println(kilobytes+" KB = "+mb+" MB and "+kb+" KB");
		}
		else {
			System.out.println("invalid input");
		}
	}

}
