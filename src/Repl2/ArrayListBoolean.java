package Repl2;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListBoolean {

	public static void main(String[] args) {
//		Create an ArrayList of type boolean called listA and add below values//
//		(true, false, false)//
//		Create another array list call listB and ad all values from List A into it//
//		Using iterator print all values from ListB 1 by 1//
//		Expected Output://
//		true
//		false
//		false

		ArrayList<Boolean> listA = new ArrayList<>();
		listA.add(true);
		listA.add(false);
		listA.add(false);

		ArrayList<Boolean> listB = new ArrayList<>(listA);
		
		Iterator <Boolean> it=listB.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
