package TaskSquare;

import java.util.Scanner;

public class EnteringSide {

	public static void main(String[] args) {
		final double P = Math.PI;
		int figure = 4;
		outer: while (figure != 0) {
			System.out.println("Choose the figure to calculate the square:");
			System.out.println("1 is Rectangle, 2 is Foursquare, 3 is Circle, 0 to exit");
			Scanner s = new Scanner(System.in);
			figure = s.nextInt();
			switch (figure) {
			case 0:
				break outer;
			case 1:
				System.out.println("Enter the first side of Rectangle ");
				Scanner fs = new Scanner(System.in);
				int rectangle1 = fs.nextInt();
				System.out.println("Enter the second side of Rectangle ");
				Scanner ss = new Scanner(System.in);
				int rectangle2 = ss.nextInt();
				A rect = new A();
				rect.calcSquare(rectangle1, rectangle2);
				break;
			case 2:
				System.out.println("Enter the side of Foursquare ");
				Scanner fos = new Scanner(System.in);
				int foursquare = fos.nextInt();
				A four = new A();
				four.calcSquare(foursquare);
				break;
			case 3:
				System.out.println("Enter the radius of Circle ");
				Scanner cr = new Scanner(System.in);
				int circle = cr.nextInt();
				A circl = new A();
				circl.calcSquare(P, circle);
				break;
			default:
				System.out.println("The number you entered is incorrect");
				break;
			}
		}
	}
}
