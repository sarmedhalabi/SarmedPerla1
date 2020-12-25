package Repl;

public class TestCar {

	public static void main(String[] args) {

		CnstructorCar obj=new CnstructorCar("Toyota","Prius",4,120,30000.0);
		obj.displayMethod();
		
		CnstructorCar obj1=new CnstructorCar("Toyota","Prius",120,30000.0);
		obj1.displayMethod();
		
		CnstructorCar obj2=new CnstructorCar(4,120,30000.0);
		obj2.displayMethod();
		
		CnstructorCar obj3=new CnstructorCar("Toyota","Prius",4);
		obj3.displayMethod();
	}

}
