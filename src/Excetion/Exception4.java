package Excetion;

import java.util.Scanner;

public class Exception4 {

	public static void main(String[] args) {
//
//		Create a method that will do temperature check. Anytime user passes temperture that is 
//		below 32 method should throw an Exception saying "It is freezing"
//
//		In Main method call the method and handle an Exception
//
//		Expected Output: 
//
//		java.lang.RuntimeException: It is freezing
		
		try{
			checkTemp(22);
		
		}catch(RuntimeException e) {
			System.out.println(e);
		}
	}
	
	public static void checkTemp(double temp) {
		if(temp<32) {
			throw new RuntimeException("It is freezing");
		}
	}

}
