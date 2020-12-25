package Repl3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapOfStringPairs {

	public static void main(String[] args) {
//		Hash Map
//		Create a Hash Map of String pairs 
//		add the follow values
//		map.put("ONE","AAA");
//		map.put("TWO","BBB");
//		map.put("THREE","CCC");
//		map.put("FOUR","DDD");
//		map.put("FIVE","EEE");
//
//		Using entry set print key and values pairs using loop
//
//		Remove below from Map
//		"ONE"
//		"FOUR"
//
//		Using entry set print key and values pairs using loop
//
//		Expected Output:
//
//		HashMap Before Remove :
//		FIVE : EEE
//		ONE : AAA
//		FOUR : DDD
//		TWO : BBB
//		THREE : CCC
//		------------------
//		HashMap After Remove :
//		FIVE : EEE
//		TWO : BBB
//		THREE : CCC
		Map<String, String> map = new HashMap<>();
		map.put("ONE", "AAA");
		map.put("TWO", "BBB");
		map.put("THREE", "CCC");
		map.put("FOUR", "DDD");
		map.put("FIVE", "EEE");

		System.out.println("HashMap Before Remove :");

		Set<Entry<String, String>> entries = map.entrySet();
		for (Entry<String, String> e : entries) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
		System.out.println("HashMap After Remove :");

		Iterator<Entry<String, String>> it = entries.iterator();
		while (it.hasNext()) {
			Entry<String, String> r = it.next();
			if (r.getKey().equalsIgnoreCase("one")) {
				it.remove();
			}
			if (r.getKey().equalsIgnoreCase("four")) {
				it.remove();
			}

		}
		for (Entry<String, String> e : entries) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}

	}

}
