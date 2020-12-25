package Repl3;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollection {

	public static void main(String[] args) {
//		Create a set collection in which you do not want to preserve or sort the order and add below values to it.
//		Red
//		Pink
//		Yellow
//		White
//		Black
//		Print set collection
//		And get total number of colors available in the set
//		Expected Output:
//		Original Hash Set: [Red, Pink, White, Yellow, Black]
//		Size of the Hash Set: 5
		
		Set <String>hset=new HashSet<>();
		hset.add("Red");
		hset.add("Pink");
		hset.add("Yellow");
		hset.add("White");
		hset.add("Black");

		System.out.println("Original Hash Set: "+hset);
		System.out.println("Size of the Hash Set: "+hset.size());
	}

}
