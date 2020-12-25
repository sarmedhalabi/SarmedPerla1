package Repl1;

public class MainParentTest extends ParentAbstruction {
	public  void m1(){
	    System.out.println("m1 without parameters");
	  }
	  public  void m1(String s){
	    System.out.println(s+" method with parameter");
	  }
	  public static void main(String[]args){
		  ParentAbstruction main=new MainParentTest();
	    main.m1();
	    main.m1("m1");
	  }
}

	
