package Repl3;
public class Student {
//	Create a student class that will have //
//    variables as studentId, name and lastName
//    constructor
//    method to display students details
//
//
//Create a set that will store 5 different students in an order they been added to the collection.
//
//Execute method to display students details
//
//Expected Output:
//
//Student details: Samir Jawaid with id: 101
//Student details: Asel Umurzakova with id: 102
//Student details: Diego Juarez with id: 103
//Student details: Sohil Aryan with id: 104
//Student details: Alijon Nazarov with id: 105
	int studentId;
	String name;
	String lastName;	
	
	public Student(int studentId,String name,String lastName) {
		this.studentId=studentId;
		this.name=name;
		this.lastName=lastName;		
	}		
	public void display() {
		System.out.println(name+" "+lastName+" "+"with id: "+studentId);
	}
	
}
