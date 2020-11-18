package lab3;

public class PlaneTest {
	public static void main(String[] args) {
		Plane p1 = new Plane("Airbus", "A380", 500);
		Plane p2 = new Plane("A380", 500);
		p1.setSeats(700);
		System.out.println(p1.getSeats());
		System.out.println(Plane.getPlanes()); 
	}
}
