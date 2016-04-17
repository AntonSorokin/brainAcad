package TaskPerson;

public class MethodsOverload {

	public static void main(String[] args) {
		String firstName = "Anton";
		String lastName = "Sorokin";
		String gender = "male";
		int age = 26;
		int phoneNumber = 6515549;
		Person p = new Person();
		p.test();
		p.test(firstName, lastName);
		p.test(firstName, gender, age);
		p.test(lastName, phoneNumber);
		p.test(firstName, lastName, gender, age, phoneNumber);
	}

}
