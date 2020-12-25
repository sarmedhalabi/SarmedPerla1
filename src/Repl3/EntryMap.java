package Repl3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntryMap {

	public static void main(String[] args) {

//		Create A Map that will preserve an order of entry objects//
//		Add below pairs ://
//		"Street" = "Patrick ST"
//		"Suite" = "265"
//		"City" = "Vienna"
//		"Zip" = "22180"
//		"Country" = "United State"//
//		Print all values of from the map//
//		Expected Output://
//		Patrick ST
//		265
//		Vienna
//		22180
//		United State

		Map<String, String> map = new HashMap<>();
		map.put("Street", "Patrick ST");
		map.put("Suite", "265");
		map.put("City", "Vienna");
		map.put("Zip", "22180");
		map.put("Country", "United State");

		Set<Entry<String, String>> entries = map.entrySet();

		Iterator<Entry<String, String>> it = entries.iterator();
		while (it.hasNext()) {
			Entry<String, String> e = it.next();
			System.out.println(e.getValue().toUpperCase());
		}
	}

}
