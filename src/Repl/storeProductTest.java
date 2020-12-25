package Repl;

public class storeProductTest {

	public static void main(String[] args) {

		ConstructorStroreProduct obj=new ConstructorStroreProduct("Eggs",3.0,"Produce",true,10);
		obj.display();
		
		ConstructorStroreProduct obj1=new ConstructorStroreProduct("Eggs",2,24);
		obj1.display();
		
		ConstructorStroreProduct obj2=new ConstructorStroreProduct("Eggs",2);
		obj2.display();
	}

}
