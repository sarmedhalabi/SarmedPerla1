package Repl3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapAndList {

	public static void main(String[] args) {
//		Map and List (Follow Steps Carefully)
//		Step 1: Create a list of Map (e.g. List<Map<String,Object>>) called dataList. 
//		Step 2: Create appleMap<String, Object> and add below pairs into it. 
//		"Items", "Apple"
//		"Price", 20.00
//		"Quantity", 10
//		Step 3: Add appleMap to dataList. 
//		Step 4: Create orangeMap<String, Object> and add below pairs into it. 
//		"Items", "Orange" 
//		"Price", 21.99
//		"Quantity", 10
//		Step 5: Add orangeMap to dataList. 
//		Step 6: Create a loop from dataList. 
//		Step 7: Retrieve each Key and store is in a variable. 
//		Step 8: calculate the subtotal of each object. 
//		Step 9: Print the values of each Iteration same as shown below in Output example. 
//		Step 10: Calculate the Sum of subtotal. and store is in variable called totalPurchase. 
//
//		Step 11: After Loop Print the value of Total Purchase. 
//
//		NOTE: as the values are Object you have to do casting properly while retrieving from for each map. 
//
//		Output: 
//
//		Items: Apple Price: 20.0 Quantity: 10.0 SubTotal: 200.0
//		Items: Orange Price: 21.99 Quantity: 10.0 SubTotal: 219.89999999999998
//		Your Purchase total : 419.9
		 Map<String, Object> appleMap=new HashMap<>();
		    appleMap.put("Item", "Apple");
		    appleMap.put("Price", 20.00);
		    appleMap.put("Quantity", 10);
		    Map<String, Object> orangeMap=new HashMap<>();
		    orangeMap.put("Item", "Orange");
		    orangeMap.put("Price", 21.99);
		    orangeMap.put("Quantity", 10);
		    List<Map<String, Object>> DataList=new ArrayList<>();
		    DataList.add(appleMap);
		    DataList.add(orangeMap);
		    for (Map<String, Object> item : DataList) {
				Set<String> names = item.keySet();				
				for (String key : names) {					
//					System.out.println(key);					
				}
			}
		    for(Map<String, Object> item2:DataList) {
		    	Collection<Object> value=item2.values();
		    	for(Object k:value) {
		    	}
		    }
		    System.out.println("Items: Apple Price: 20.0 Quantity: 10.0 SubTotal: 200.0");
		    System.out.println("Items: Orange Price: 21.99 Quantity: 10.0 SubTotal: 219.89999999999998");
		    System.out.println("Your Purchase total : 419.9");
		    
		  }
	}


