package Repl3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetLoopIterator {

	public static void main(String[] args) {
//		Create a Set collection in which you want to preserve an order of inserted String Objects.
//		Add the below values //
//		    null
//		    Sohil 
//		    Diego
//		    Alijon
//		    Asel
//		    Sumair //		 
//		Print values 1 by 1 using loop and Iterator 

		Set <String>lset=new LinkedHashSet<>();
		lset.add(null);
		lset.add("Sohil");
		lset.add("Diego");
		lset.add("Alijon");
		lset.add("Asel");
		lset.add("Sumair");		
		
		for(String s:lset) {
			System.out.println(s);
		}
		
		Iterator <String>it=lset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
