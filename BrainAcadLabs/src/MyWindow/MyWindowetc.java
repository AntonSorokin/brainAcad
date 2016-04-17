package MyWindow;

public class MyWindowetc {
	private double width;
	private double height;
	private int numberOfGlass;
	private String color;
	private boolean isOpen;
	public MyWindowetc() {
		this.width = 20.5;
		this.height = 10.5;
		this.numberOfGlass = 3;
		this.color = "White";
		this.isOpen = true;
	}

	public MyWindowetc(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public MyWindowetc(double width, double height, int numberOfGlass) {
		this.width = width;
		this.height = height;
		this.numberOfGlass = numberOfGlass;
	}

	public MyWindowetc(int numberOfGlass, String color) {
		this.numberOfGlass = numberOfGlass;
		this.color = color;
	}
	
	public MyWindowetc(double width, double height, boolean isOpen) {
		this.width = width;
		this.height = height;
		this.isOpen = isOpen;
	}
	public MyWindowetc(double width, double height, String color) {
		this.width = width;
		this.height = height;
		this.color = color;
	}
	
	}
