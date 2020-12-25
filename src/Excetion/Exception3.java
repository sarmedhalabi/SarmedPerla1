package Excetion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception3 {

	public static void read(String filePath) throws FileNotFoundException {

		FileInputStream fis = new FileInputStream(filePath);

	}

	public static void main(String[] args) {
//		Create a method that will not be handling exception and throwing it at caller.
//		In main method call method and handle the exception.
//
//		Expected Output:
//
//		java.io.FileNotFoundException:  (No such file or directory)

		try {
			read("");

		} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}

}
