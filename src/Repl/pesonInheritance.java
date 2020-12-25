package Repl;

public class pesonInheritance {
//	1. Create four classes (Person, Employee, Student, Retiree)
//	* Have properties
//	For Person: name(String)
//	For Person: lastName(String)
//	For Person: age(int)
//	For Employee: salary(int)
//	For Student: grade(int)
//	For Retiree: seniorActivity(String)
	
//	At Employee, Student, Retiree Class have a print method in each that prints the 
//	properties in line as shown in the output
//	Create multilevel inheritance: Person --> Employee --> Student --> Retiree
//	From your Main class create objects of the Employee, Student and Retiree classes and call the print method.
//	Expected Output: 
//	Joe Smith 35 35000
//	Adam Smith 15 10
//	Frank Smith 15 tour

	String name;
	  String lastName;
	  int age;
	  int salary;
	  int grade;
	  String seniorActivity;
	  
	  pesonInheritance(String name,String lastName,int age,int salary,int grade,String seniorActivity){
		  this.name=name;
		  this.lastName=lastName;
		  this.age=age;
		  this.salary=salary;
		  this.grade=grade;
		  this.seniorActivity=seniorActivity;
	  } 
}

class Employee extends pesonInheritance{
	
		
	
	Employee(String name,String lastName,int age,int salary,int grade,String seniorActivity) {
		super(name, lastName, age, salary, grade, seniorActivity);
	}

	void print1() {
		System.out.println(name+" "+lastName+" "+age+" "+salary);
	}
}

class Student extends Employee{
	
	Student(String name, String lastName, int age, int salary, int grade, String seniorActivity) {
		super(name, lastName, age, salary, grade, seniorActivity);
	}

	void print2() {
		System.out.println(name+" "+lastName+" "+age+" "+grade);
	}
}

class Retiree extends Student{
	
	Retiree(String name, String lastName, int age, int salary, int grade, String seniorActivity) {
		super(name, lastName, age, salary, grade, seniorActivity);
	}

	void print3() {
		System.out.println(name+" "+lastName+" "+age+" "+seniorActivity);
	}
}
