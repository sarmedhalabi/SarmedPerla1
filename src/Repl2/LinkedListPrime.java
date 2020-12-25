package Repl2;

import java.util.List;
import java.util.LinkedList;

public class LinkedListPrime {

	public static void main(String[] args) {
//		Create an Linked List that will store all prime numbers from 1 to 100//
//		Step 1. Create a method that will identify wether number is prime or not
//		Step 2. Add all prime numbers into Linked List//
//		Print Linked List://
//		Expected Output:
//		[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97]
		
		List<Integer> primeNumbers = new LinkedList<>();
		for (int i = 2; i <= 100; i++) {
			if (isPrime(i)) {
				primeNumbers.add(i);
			}
		}

		System.out.println(primeNumbers);
	}

	public static boolean isPrime(int number) {
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}