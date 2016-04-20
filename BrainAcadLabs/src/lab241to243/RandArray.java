package lab241to243;

import java.util.Random;

public class RandArray {

	public static int[] array() {
		Random r = new Random();
		int rand = r.nextInt(10) + 5;
		int[] arr = new int[rand];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(100);
		}
		return arr;
	}
}
