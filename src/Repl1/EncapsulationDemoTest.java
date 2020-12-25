package Repl1;

public class EncapsulationDemoTest {

	public static void main(String[] args) {
		EncapsulationDemo person=new EncapsulationDemo();
		person.setFirstname("John");
		person.setLastname("Doe");
		person.setBirthmonth(10);
		person.setBirthday(25);
		person.setBirthyear(1900);
		person.setSsn("123-45-6789");
		
		System.out.println(person.getFirstname());
		System.out.println(person.getLastname());
		System.out.println(person.formatBirthday());
		System.out.println(person.getSsn());
	  }
	}
