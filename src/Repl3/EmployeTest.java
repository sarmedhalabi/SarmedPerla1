package Repl3;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class EmployeTest {

	public static void main(String[] args) {

		Set<Employee>set=new LinkedHashSet<>();
		set.add(new Employee("John Doe","123456789",80000.0));
		set.add(new Employee("Jane Smith","987654321",90000.0));
		set.add(new Employee("Jackie Chan","0",1000000.0));
		
		Iterator<Employee>it=set.iterator();
		while(it.hasNext()) {
			Employee emp=it.next();
			System.out.println(emp.getFullName());
			System.out.println(emp.getSsn());
			System.out.println(emp.getSalary());
		}
	}

}
