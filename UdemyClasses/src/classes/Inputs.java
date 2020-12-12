package classes;

public class Inputs {
	
	private double firstNumber;
	private double secondNumber;
	private double result;
	
	
	public void setFirstNumber(double firstNumber) {
		this.firstNumber=firstNumber;	
	}
	
	public double getFirstNumber() {
		return this.firstNumber;
	}
	
	public void setSecondNumber(double secondNumber) {
		this.secondNumber=secondNumber;	
	}
	
	public double getSecondNumber() {
		return this.secondNumber;
	}
	
	public double getAddResult() {
		return firstNumber+secondNumber;
	}
	
	public double getSubResult() {
		return firstNumber-secondNumber;
	}
	public double getMulResult() {
		return firstNumber*secondNumber;
	}
	public double getDivResult() {
		return firstNumber/secondNumber;
	}
	
}
