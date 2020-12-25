package Repl2;

import java.util.LinkedList;
import java.util.List;

public class ListOfHashSet {

	public static void main(String[] args) {
//		Create Linked List that will store Integer Objects//
//		Add the values below:
//		111
//		222
//		333
//		444
//		555
//		666//
//		Create a logic to calculate sum of the all the values in list. 
//
//		Print the result of sum. 
//
//		Expected Output:
//
//		Result of sum is 2331
		List <Integer>num=new LinkedList<>();
		Integer sum=0;
		num.add(111);
		num.add(222);
		num.add(333);
		num.add(444);
		num.add(555);
		num.add(666);

		for(int nums:num) {
			sum=sum+nums;
		}
		System.out.println("Result of sum is "+sum);
	}

}
