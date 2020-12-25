package Repl3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapValue {

	public static void main(String[] args) {
//		Create HashMap 
//		add values as below
//
//		map.put("mango", 10); 
//		map.put("apple", 30); 
//		map.put("orange", 20); 
//		map.put("mango", 40); 
//		 map.put("mango", 40);     
//
//		Using iterator retrieve all keys and values if the format below:
//
//		Expected Output:
//
//		Key = orange and value = 20
//		Key = apple and value = 30
//		Key = mango and value = 40
		Map <String, Integer>map=new HashMap<>();
		map.put("mango", 10); 
		map.put("apple", 30); 
		map.put("orange", 20); 
		map.put("mango", 40); 
		map.put("mango", 40);
		
		Set <Entry<String, Integer>>entries=map.entrySet();
		
		Iterator <Entry<String, Integer>> it=entries.iterator();
		while(it.hasNext()) {
		Entry<String, Integer> e=it.next();
		System.out.println("Key = "+e.getKey()+" and value = "+e.getValue());
		}
	}

}
