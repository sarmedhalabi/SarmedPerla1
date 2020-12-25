package Repl;

public class CnstructorCar {
//1. Complete the Car.java class:
//	Create the following variable (Choose proper datatype)
//		 * make*model*numberOfDoors*topSpeed*price
//		 following the proper naming convention for variables. 
//		 Write four constructors:
//		 * The first constructor(with all parameters)
//		 * A secondary constructor Have all parameters except numberOfDoors. (numberOfDoors value 
//				 should assign to 4 inside constructor)
//		 * A third constructor Have all parameters except make and model . 
//		 (make and model value should assign to "unknown" inside constructor) 
//		 * A fourth constructor Have all parameters except topSpeed and price;
//(topSpeed value should assign to "90" and price value should be assign to 0 inside constructor)  
//		 Create a display method in Cars class to print the class variable value in console. 
//		 2. Test your code with the Main.java class:
//		 Create several Car objects using all Constructors. 
//		 then call display method with each object. 
//		 Output: 
//		 Toyota Prius 4 120 30000.0
//		 Toyota Prius 4 120 30000.0
//		 unknown unknown 4 120 30000.0
//		 Toyota Prius 4 90 0.0
	String make;
	String model;
	int numberOfDoors;
	int topSpeed;
	double price;
	CnstructorCar(String make,String model,int numberOfDoors,int topSpeed,double price){
		this.make=make;
		this.model=model;
		this.numberOfDoors=numberOfDoors;
		this.topSpeed=topSpeed;
		this.price=price;
	}
	CnstructorCar(String make,String model,int topSpeed,double price){
		this.make=make;
		this.model=model;
		this.numberOfDoors=4;
		this.topSpeed=topSpeed;
		this.price=price;
	}
	CnstructorCar(int numberOfDoors,int topSpeed,double price){	
		this.make="unknown";
		this.model="unknown";
		this.numberOfDoors=numberOfDoors;
		this.topSpeed=topSpeed;
		this.price=price;
	}
	CnstructorCar(String make,String model,int numberOfDoors){	
		this.make=make;
		this.model=model;
		this.numberOfDoors=numberOfDoors;
		this.topSpeed=90;
		this.price=0;
	}
	public void displayMethod() {
		System.out.println(make+" "+model+" "+numberOfDoors+" "+topSpeed+" "+price);
	}
}
