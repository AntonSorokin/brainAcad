package MyWindow;

public class MyWindow {
	private double width;
	private double height;
	private int numberOfGlass;
	private String color;
	private boolean isOpen;

	public MyWindow(double width, double height, int numberOfGlass, String color, boolean isOpen) {
		this.width = width;
		this.height = height;
		this.numberOfGlass = numberOfGlass;
		this.color = color;
		this.isOpen = isOpen;
	}

	public MyWindow() {
		this.width = 20.5;
		this.height = 10.5;
		this.numberOfGlass = 3;
		this.color = "White";
		this.isOpen = true;
	}

	public MyWindow(double width, double height) {
		this(width, height, 3);
	}

	public MyWindow(double width, double height, int numberOfGlass) {
		this(width, height, numberOfGlass, "Black", false);
	}

	public void printFields() {
		System.out.println("width " + width + " height " + height + " numberOfGlass " + " numberOfGlass "
				+ numberOfGlass + " color " + color + " isOpen " + isOpen);
	}

	public static void main(String[] args) {

		MyWindow[] mw = new MyWindow[4];
		mw[0] = new MyWindow();
		mw[0].printFields();
		mw[1] = new MyWindow(1, 2);
		mw[1].printFields();
		mw[2] = new MyWindow(3, 4, 5);
		mw[2].printFields();
		mw[3] = new MyWindow(6, 7, 8, "Red", false);
		mw[3].printFields();
	}

}
