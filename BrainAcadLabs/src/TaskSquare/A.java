package TaskSquare;

public class A {

	public void calcSquare(final double P, int circle) {
		System.out.println("Square of circle equals " + P * Math.pow(circle, 2));
		System.out.println();
	}

	public void calcSquare(int rectangle1, int rectangle2) {
		System.out.println("Square of rectangle equals " + rectangle1 * rectangle2);
		System.out.println();
	}

	public void calcSquare(int foursquare) {
		System.out.println("Sqaure of foursquare equals " + Math.pow(foursquare, 2));
		System.out.println();
	}
}
