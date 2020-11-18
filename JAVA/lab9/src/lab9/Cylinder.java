package lab9;

public class Cylinder extends Circle {
	private double height;
	public Cylinder(double radius, String color, double height) {
		super(radius, color);
		this.height = height;
	}
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	public Cylinder() {
		this(0, "white", 0);
		
	}
	public double getHeight() {
		return height;
	}
	public double getVolume() {
		return getArea() * height;
	}
	@Override
	public String toString() {
		return super.toString() + "Cylinder [height=" + height + "]";
	}
	
}
