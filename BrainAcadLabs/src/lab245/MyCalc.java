package lab245;

public class MyCalc {

	public static double calcPi(int n) {
		double pi = 4;
		int counter = 0;
		for (double i = 1; i <= n * 4 + 1; i += 2) {
			if (counter % 2 == 0 && i > 2) {
				pi = pi - (4 / i);
				counter++;
			} else if (i > 2) {
				pi = pi + (4 / i);
				counter++;
			}

		}
		return pi;
	}
}
