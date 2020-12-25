package Repl3;

public class Employee {
//	Create an Employee class that will be fully encapsulated and will have://
//	    variables as FullName, ssn and salary
//	    constructor to initialize instance variables
//	    getters to have an access to instance variables//
//	Create a set collection that will store # objects of Employee type and using Iterator print the 
//	value of each variable//
//	Expected Output://
//	John Doe
//	123456789
//	80000.0
//	Jane Smith
//	987654321
//	90000.0
//	Jackie Chan
//	0
//	1000000.0
	private String FullName;
	public String getFullName() {
		return FullName;
	}

	public String getSsn() {
		return ssn;
	}

	public double getSalary() {
		return salary;
	}

	private String ssn;
	private double salary;
	
	public Employee(String FullName,String ssn, double salary) {
		this.FullName=FullName;
		this.ssn=ssn;
		this.salary=salary;
	}
}
