package Repl;

public class EmployeeTest {
public static void main(String[] args) {
	EmployeeCons obj=new EmployeeCons();
	obj.print();
	
	EmployeeCons obj1=new EmployeeCons("Joe","Smith",12345,"01/01/1970",35000);
	obj1.print();
}
}
