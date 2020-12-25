package Repl3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class UnorderedMap {

	public static void main(String[] args) {
//		Create a Map in which you do not need to preserve the order of the entries
//		Add below pair to it . //
//		"Street" = "Patrick ST"
//		"Suite" = "265"
//		"City" = "Vienna"
//		"Zip" = "22180"
//		"Country" = "United State"//
//		Find how many entries are inside the map
//		Remove all entires from the Map
//		Find the Map size again//
//		Expected Output://
//		5
//		0
		
		Map <String, String>map=new HashMap<>();
		map.put("Street", "Patrick ST");
		map.put("Suite", "265 ST");
		map.put("City", "Vienna");
		map.put("Zip", "22180");
		map.put("Country", "United State");
		System.out.println(map.size());
		
		Set <Entry<String, String>>entry=map.entrySet();
		
		Iterator <Entry<String, String>>it=entry.iterator();
		while(it.hasNext()) {
			it.next();
			if(it.next().equals("ONE")) {
			it.remove();}
		}
		
		System.out.println(map.size());
		
		
	}

}
