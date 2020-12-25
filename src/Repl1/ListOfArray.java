package Repl1;

import java.util.ArrayList;

public class ListOfArray {

	public static void main(String[] args) {
//		Create an array list that will hold String Objects
//		Find out wether array list is empty or not. 
//		Add String value "Syntax" to it
//		Find out wether array list is empty or not. 
		ArrayList <String> obj=new ArrayList<>();
		System.out.println(obj.isEmpty());
		obj.add("Syntax");
		System.out.println(obj.isEmpty());
	}

}
