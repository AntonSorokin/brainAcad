package TaskEmployee;

public class Employee {
	public void calcSalary(String name, double... salary) {
		double totalSalary = 0.0;
		for (double s : salary) {
			totalSalary += s;
		}
		System.out.println("The total salary of " + name + " is " + totalSalary);
	}
}
