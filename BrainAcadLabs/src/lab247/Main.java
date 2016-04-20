package lab247;

public class Main {

	public static void main(String[] args) {
		double time = 50.5;
		System.out.println("Position of an object after falling for " + time + " seconds shifted to " + GravityCalculator.calcDist(time) + " meters");
	}

}
