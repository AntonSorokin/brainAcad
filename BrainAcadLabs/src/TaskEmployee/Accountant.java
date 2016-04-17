package TaskEmployee;

import java.util.Scanner;

public class Accountant {
	public static void main(String[] args) {
		System.out.print("What is the name of employee? ");
		Scanner s = new Scanner(System.in);
		String name = s.next();
		double salary = 0.0;
		int i = 0;
		double[] sal = new double[1000];
		while (true) {
			System.out.print("Enter salary. Enter -1 to finish ");
			Scanner t = new Scanner(System.in);
			salary = t.nextDouble();
			if (salary == -1.0) {
				break;
			}
			sal[i] = salary;
			i++;
		}
		Employee e = new Employee(name, sal);
		e.calcSalary(name, sal);
	}
}
