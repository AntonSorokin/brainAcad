package lab246;

public class MyPyramid {
	public static void printPyramid(int h) {
		int counter = h;
		String firstPartOfPyramid = "";
		String secondPartOfPyramid = "";
		if (h > 0 && h < 10) {
			for (int j = 1; j <= h; j++) {
				for (int i = counter; i > 1; i--) {
					System.out.print(" ");
				}
				counter--;
				firstPartOfPyramid = firstPartOfPyramid + j;
				if (j == 1) {
					System.out.println(firstPartOfPyramid);
				} else {
					System.out.print(firstPartOfPyramid);
					secondPartOfPyramid = (j - 1) + secondPartOfPyramid;
					System.out.println(secondPartOfPyramid);
				}
			}

		} else {
			System.out.println("Height of the pyramid mus be from 1 to 9");
		}
	}
}
