package Repl;

public class ShoppingStoreTest {

	public static void main(String[] args) {
		ShoppingStore obj = new ShoppingStore("Blanket",49.99,2);
	    ShoppingStore obj1 = new ShoppingStore("Mattress",219.59,2);
	    System.out.println(obj.item+" Total Value "+obj.itemTotalPrice());
	    System.out.println(obj1.item+" Total Value "+obj1.itemTotalPrice());
	    System.out.println("You purchased "+(obj.itemTotalPrice()+obj1.itemTotalPrice())+" Today");
	  }
	}


