package lab247;

public class GravityCalculator {
	
	private static final double A = -9.81;
	private static double v;
	private static double x;
	
	public static double calcDist(double t) {
		v=0;
		x=0;
		double distance = 0.5*(A*t)+(v*t)+x;
		return distance;
	}
	
}
