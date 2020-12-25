package Excetion;

public class Exception5 {

	public static void main(String[] args) {
//		Instructions from your teacher:
//			Create a custom Exception class
//			In main class create a method that will check students grade
//			if students grade is >90 then below exception should be thrown
//			if students grade is below 90 print "You are a great student"
//
//			In main method calls method gradeCheck and handle an Exception
//
//			Expected Output:
//
//			SyntaxStudentException: You are an exceptionally awesome stud

		gradeCheck(98);

	}

	public static void gradeCheck(int grade) {
		try{
			if (grade > 90) {
		
			throw new RuntimeException("SyntaxStudentException: You are an exceptionally awesome stud");
		} else {
			throw new RuntimeException("You are a great student");
		}
	}catch(RuntimeException e){
		System.out.println(e.getMessage());
	}
	}

}
