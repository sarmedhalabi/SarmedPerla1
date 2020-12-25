package Repl;

public class test1 {

	public int a;

	test1(int a) {
		this.a = a;
		System.out.println("Welcome to the Syntax");
	}

	test1() {
		System.out.println("I am the student at Technologies");
	}

	public static void main(String[] args) {
		test1 obj = new test1(10);
		test1 obj1 = new test1();
	}
}
