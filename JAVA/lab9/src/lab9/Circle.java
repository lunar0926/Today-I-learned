package lab9;

public class Circle {
	private double radius;
	private String color;
	
	public Circle() {
		this(0, "White");
	}
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getArea() {
		return radius * radius * Math.PI;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
}