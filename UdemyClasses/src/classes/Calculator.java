package classes;

public class Calculator {

	public static void main(String[] args) {
		Inputs cal=new Inputs();
		cal.setFirstNumber(4.0d);
		cal.setSecondNumber(12.0d);
		System.out.println("Addition is "+cal.getAddResult());
		System.out.println("Subtarction is "+cal.getSubResult());
		System.out.println("Multiplication is is "+cal.getMulResult());
		System.out.println("Division is "+cal.getDivResult());

	}

}
