package Repl1;

 class FirstInterfaceTest implements FirstInterface,  SecondInterface{
	
		   public void firstMethod(){
		     System.out.println("First Method implementing multiple Inheritance");
		   }
		   public void SecondMethod(){
		     System.out.println("Second Method implementing multiple Inheritance");
		   }
		   public static void main(String[]args){
		     FirstInterface main=new FirstInterfaceTest();
		     main.firstMethod();
		     ((FirstInterfaceTest) main).SecondMethod();
		   } 
		}

