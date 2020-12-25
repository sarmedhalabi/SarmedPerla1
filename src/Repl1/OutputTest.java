package Repl1;

public class OutputTest implements Functions {
	

	public static void main(String[] args) {
	    double firstNumber = 100.00; 
	    double SecondNumber = 20.00;
	    double result;
	    OutputTest output=new OutputTest();
	   result=output.methodAdd(firstNumber, SecondNumber);
	   output.display(result);
	   result=output.methodSub(firstNumber, SecondNumber);
	   output.display(result);
	   result=output.methodMult(firstNumber, SecondNumber);
	   output.display(result);
	   result=output.methodDiv(firstNumber, SecondNumber);
	   output.display(result);
	}

	@Override
	public void display(double result) {
		System.out.println("Result is ::: " + result);
	}

	@Override
	public double methodAdd(double firstNumber, double SecondNumber) {
		return firstNumber+SecondNumber;
	}

	@Override
	public double methodSub(double firstNumber, double SecondNumber) {
		return firstNumber-SecondNumber;
	}

	@Override
	public double methodMult(double firstNumber, double SecondNumber) {
		return firstNumber*SecondNumber;
	}

	@Override
	public double methodDiv(double firstNumber, double SecondNumber) {
		return firstNumber/SecondNumber;
	}

}
