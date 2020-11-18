package lab3;

public class Circle {
	private double radius;
	private static final double PI = 3.141592; // ���� ���
	
	public Circle(double radius) {
		this.radius = radius;
	} // ���� �������� �Ű� ������ �޴� �����ڸ� �ۼ�
	public void setRadius(double radius) {
		this.radius = radius;
	} // ������
	public double getRadius() {
		return radius;
	} // ������ 
	private double square(double r) {
		return r * r;
	}
	
	public double getArea() {
		return square(radius) * PI;	
	}
	public double getPerimeter() {
		return 2 * PI * radius;
	}
	public static double getPI() {
		return PI;
	}
}
