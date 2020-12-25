package Repl2;

import java.util.*;
//import java.util.List;

public class Test {

	public static void main(String[] args) {
		LinkedList<String> countries = new LinkedList<>();
		countries.add("Armenia");
		countries.add("USA");
		countries.add("Kazakhstan");
		countries.add("Australia");
		countries.add("Pakistan");
		countries.add("Russia");
		countries.add("Azerbaijan");
		
		Iterator <String> it=countries.iterator();
		while(it.hasNext()) {
		String country=it.next();
		if(country.startsWith("A")) {
			it.remove();
		}
		}
		System.out.println(countries);
		
	}

}
