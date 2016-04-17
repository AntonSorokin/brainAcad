package Main;

import java.util.Arrays;
import java.util.Random;

public class Matrix {
	Random r = new Random();
	private int[][] arr1 = { { r.nextInt(10) + 1, r.nextInt(10) + 1 }, { r.nextInt(10) + 1, r.nextInt(10) + 1 } };
	private int[][] arr2 = { { r.nextInt(10) + 1, r.nextInt(10) + 1 }, { r.nextInt(10) + 1, r.nextInt(10) + 1 } };
	private int[][] arr3 = new int[2][2];

	public void printArrays() {
		System.out.println(" Arr1: \t Arr2:");
		for (int i = 0; i < 2; i++) {
			System.out.print(Arrays.toString(arr1[i]) + "\t");
			System.out.print(Arrays.toString(arr2[i]));
			System.out.println();
		}
	}

	public void multiplication() {
		arr3[0][0] = (arr1[0][0] * arr2[0][0]) + (arr1[0][1] * arr2[1][0]);
		arr3[0][1] = (arr1[0][0] * arr2[0][1]) + (arr1[0][1] * arr2[1][1]);
		arr3[1][0] = (arr1[1][0] * arr2[0][1]) + (arr1[1][1] * arr2[1][0]);
		arr3[1][1] = (arr1[1][0] * arr2[0][1]) + (arr1[1][1] * arr2[1][1]);
		System.out.println();
		System.out.println("Arr1*Arr2:");
		for (int i = 0; i < 2; i++) {
			System.out.print(Arrays.toString(arr3[i]));
			System.out.println();
		}
	}

	public void addition() {
		System.out.println();
		System.out.println("Arr1+Arr2:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				arr3[i][j] = (arr1[i][j] + arr2[i][j]);
			}
			System.out.print(Arrays.toString(arr3[i]));
			System.out.println();
		}
	}
}
