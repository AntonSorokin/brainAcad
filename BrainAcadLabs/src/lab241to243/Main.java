package lab241to243;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] arr1 = RandArray.array();
		int[] arr2 = RandArray.array();
		System.out.println("Array is: " + Arrays.toString(arr1));
		System.out.println("Min value is: " + MyMath.findMin(arr1) + "\t" + "Max value is: " + MyMath.findMax(arr1));
		System.out.println();
		System.out.println("Array is: " + Arrays.toString(arr2));
		System.out.println("Min value is: " + MyMath.findMin(arr2) + "\t" + "Max value is: " + MyMath.findMax(arr2));
		System.out.println();
		System.out
				.println("Area of a circle which radius is " + arr1[0] + " equals to " + MyMath.areaOfCircle(arr1[0]));
	}
}
