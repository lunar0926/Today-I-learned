package ch6;
import java.util.*;

public class Two {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("x���� �Է����ּ���: ");
		double x = scan.nextDouble();
		// x�� �Է�
		
		double fx;
		if (x <= 0) {
			fx = x * x * x - 9 * x + 2;
		}
		else {
			fx = 7 * x + 2;
		}
		System.out.println("f(x)= " + fx);
	}
}
