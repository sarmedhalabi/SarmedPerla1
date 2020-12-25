package Repl1;

public interface Outputs {
	public void display(double result );
	}
interface Functions extends Outputs{
	  public double methodAdd(double firstNumber, double SecondNumber);
	  public double methodSub(double firstNumber, double SecondNumber);
	  public double methodMult(double firstNumber, double SecondNumber);
	  public double methodDiv(double firstNumber, double SecondNumber);
	}
