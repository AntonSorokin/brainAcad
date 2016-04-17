package TaskPerson;

public class Person {
	private String firstName;
	private String lastName;
	private String gender;
	private int age;
	private int phoneNumber;

	public void test() {
		System.out.println("No parameters");
	}

	public void test(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("First name is " + firstName+ " and last name is " + lastName );
	}
	
	public void test(String firstName, String gender, int age) {
		this.firstName = firstName;
		this.gender = gender;
		this.age = age;
		System.out.println("First name is " + firstName + ", gender is " + gender + " , age is " + age + " years old");
	}
	
	public void test(String lastName, int phoneNumber) {
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		System.out.println("Last name is " + lastName + ", phone number is " + phoneNumber);
	}
	
	public void test(String firstName, String lastName, String gender, int age, int phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = age;
		this.phoneNumber = phoneNumber;
		System.out.println("First name is " + firstName + ", last name is " + lastName + ", gender is " + gender + " , age is " + age + " years old and phone number is " + phoneNumber);
	}
}
