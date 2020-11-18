package lab3;

public class Circle {
	private double radius;
	private static final double PI = 3.141592; // 정적 상수
	
	public Circle(double radius) {
		this.radius = radius;
	} // 원의 반지름을 매개 변수로 받는 생성자를 작성
	public void setRadius(double radius) {
		this.radius = radius;
	} // 설정자
	public double getRadius() {
		return radius;
	} // 접근자 
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
