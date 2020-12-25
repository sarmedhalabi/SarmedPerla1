package Excetion;

public class Exception2 {

	public static void main(String[] args) {
//		Create a program that will handle exception to match below output:
//
//			Expected Output:
//
//			java.lang.ArrayIndexOutOfBoundsException: 4
//				at Main.main(Main.java:5)
		
		try{String [] Array= {"Hello","Mahady","Sarmed","Lilly"};
		System.out.println(Array[4]);
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
	}

}
