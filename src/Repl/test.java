package Repl;

public class test {

	 void m1(){
		    System.out.println("m1 method in parent class");
		  }
		}

 class grandchild extends test{
	  void m1(){
	    System.out.println("m1 method in child class");
	  }
	  void m2(){	    
	     this.m1();
	     super.m1();
	  }
	}
