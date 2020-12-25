package Repl1;

 public class FinalExample {
	final int num;
	public FinalExample(){
		this.num = 5;
	}
	final public void method() {
		System.out.println("Hello World");
		}
	
	public static void main(String[] args) {
		FinalExample obj=new FinalExample();
		System.out.println(obj.num);
		Final finale= new Final();
//		finale.finalMethod();
		finale.method(5);
	}
}
class Final extends FinalExample{
	final public void method(int num) {
		System.out.println("I am Final class Method overload Test");
	}
}

	