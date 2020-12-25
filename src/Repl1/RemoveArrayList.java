package Repl1;

import java.util.ArrayList;

public class RemoveArrayList {

	public static void main(String[] args) {

		ArrayList <String> list=new ArrayList<>();
	    list.add("hi");
	    list.add("yo");
	    list.add("sup");
	    list.add("yolo");
	    list.add("boop");
	    System.out.println(list);
	    list.remove(0);
	    list.remove(1);	    
	     list.remove(2);
	     System.out.println(list);
	     for(String array:list) {
	    	 System.out.print(array+" ");
	     }
	  }
}
