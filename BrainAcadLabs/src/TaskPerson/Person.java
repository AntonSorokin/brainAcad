package TaskPerson;

public class Person {

	public void test() {
		System.out.println("No parameters");
	}

	public void test(String firstName, String lastName) {
		System.out.println("First name is " + firstName + " and last name is " + lastName);
	}

	public void test(String firstName, String gender, int age) {
		System.out.println("First name is " + firstName + ", gender is " + gender + " , age is " + age + " years old");
	}

	public void test(String lastName, int phoneNumber) {
		System.out.println("Last name is " + lastName + ", phone number is " + phoneNumber);
	}

	public void test(String firstName, String lastName, String gender, int age, int phoneNumber) {
		System.out.println("First name is " + firstName + ", last name is " + lastName + ", gender is " + gender
				+ " , age is " + age + " years old and phone number is " + phoneNumber);
	}
}
