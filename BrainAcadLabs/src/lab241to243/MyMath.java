package lab241to243;

public class MyMath {

	private static final double PI = 3.14;

	public static int findMin(int[] arr) {
		int minValue = arr[0];
		for (int i : arr) {
			if (i < minValue) {
				minValue = i;
			}
		}
		return minValue;
	}

	public static int findMax(int[] arr) {
		int maxValue = arr[0];
		for (int i : arr) {
			if (i > maxValue) {
				maxValue = i;
			}
		}
		return maxValue;
	}

	public static double areaOfCircle(double radius) {
		radius = PI * Math.pow(radius, 2);
		return radius;
	}

}
