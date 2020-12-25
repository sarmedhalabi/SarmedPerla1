package Repl3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



import java.util.Map.Entry;

public class MoreHashMap {

	public static void main(String[] args) {
//		 Create Hash Map. 
//		 add the follow values
//
//		 map.put("ONE","AAA");
//		 map.put("TWO","BBB");
//		 map.put("THREE","CCC");
//		 map.put("FOUR","DDD");
//		 map.put("FIVE","EEE");
//
//		 Using EntrySet print the key and values pairs using iterator only
//
//		 replace with below key THREE--> ASEL and key FIVE-->SUMAIR
//
//		 Using EntrySet print the key and values pairs using iterator only
//
//		 OUTPUT
//		  
//
//		 HashMap Before Replace :
//		 FIVE : EEE
//		 ONE : AAA
//		 FOUR : DDD
//		 TWO : BBB
//		 THREE : CCC
//		 ------------------
//		 HashMap After Replace :
//		 FIVE : SUMAIR
//		 ONE : AAA
//		 FOUR : DDD
//		 TWO : BBB
//		 THREE : ASEL
		Map<String, String> map = new HashMap<>();
		map.put("ONE","AAA");
		 map.put("TWO","BBB");
		 map.put("THREE","CCC");
		 map.put("FOUR","DDD");
		 map.put("FIVE","EEE");
		 
		 System.out.println("HashMap Before Replace :");
		 
		 Set<Entry<String, String>> entries = map.entrySet();
		Iterator <Entry<String, String>>it=entries.iterator();
		while(it.hasNext()) {
			Entry<String, String>e=it.next();
			 System.out.println(e.getKey()+" : "+e.getValue());
		}
		map.replace("THREE","ASEL");
		map.replace("FIVE","SUMAIR");
		System.out.println("----------------");
		System.out.println("HashMap After Replace :");
		Iterator <Entry<String, String>>itr=entries.iterator();
		while(itr.hasNext()) {
			Entry<String, String>e=itr.next();
			 System.out.println(e.getKey()+" : "+e.getValue());
		}
	}

}
