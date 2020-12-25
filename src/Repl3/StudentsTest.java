package Repl3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class StudentsTest {

	public static void main(String[] args) {
		Set <Student>stu=new LinkedHashSet<>();
		stu.add(new Student(101,"Samir","Jawaid"));
		stu.add(new Student(102,"Asel","Umurzakova"));
		stu.add(new Student(103,"Diego","Juarez"));
		stu.add(new Student(104,"Sohil","Aryan"));
		stu.add(new Student(105,"Alijon","Nazarov"));
		
		Iterator <Student>it=stu.iterator();
		while(it.hasNext()) {
			Student s=it.next();
			s.display();
		}
		
	}

}
