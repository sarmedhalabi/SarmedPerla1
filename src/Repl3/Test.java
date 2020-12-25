package Repl3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {

	public static void main(String[] args) {

		List <String>list=new LinkedList<>();
		list.add("usa");
		list.add("italy");
		list.add("canada");
		list.add("chili");
		
		Iterator<String>it=list.iterator();
		while(it.hasNext()) {
			String s=it.next();
			if(s.contains("s")) {
				it.remove();
			}
			
			System.out.println(list);
		}
	}

}
