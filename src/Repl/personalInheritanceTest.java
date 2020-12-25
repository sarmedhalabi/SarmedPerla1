package Repl;

public class personalInheritanceTest {

	public static void main(String[] args) {

		Employee obj=new Employee("Joe","Smith",35,35000, 0, null);
		obj.print1();
		
		Student obj1=new Student("Adam","Smith",15,35000, 10, null);
		obj1.print2();
		
		Retiree obj2=new Retiree("Frank","Smith",15,35000, 0, "tour");
		obj2.print3();
	}

}
