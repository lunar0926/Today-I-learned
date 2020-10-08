package ch6;
import java.util.*;

public class Two {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("x값을 입력해주세요: ");
		double x = scan.nextDouble();
		// x값 입력
		
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
