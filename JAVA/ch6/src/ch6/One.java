package ch6;
import java.util.*;

public class One {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b, c;
		System.out.print("정수를 입력하시오: ");
		a = scan.nextInt();
		System.out.print("정수를 입력하시오: ");
		b = scan.nextInt();
		System.out.print("정수를 입력하시오: ");
		c = scan.nextInt();
		
		if (a < b) {
			if(a < c) {
				System.out.println("가장 작은 값은: " +a);
			}
		}
		else { // a > b 인 경우
			if(b < c) {
				System.out.println("가장 작은 값은: " +b);
			}
		}
	}
}
