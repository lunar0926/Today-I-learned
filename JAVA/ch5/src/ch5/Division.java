package ch5;
import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.print("정수를 입력하시오: ");
		a = scan.nextInt();
		System.out.print("정수를 입력하시오: ");
		b = scan.nextInt();
		
		if(a > b) {
			int c = a / b; // 몫
			int d = a % b; // 나머지
			System.out.println(a + "을(를) " + b + "으로 " + "나눈 몫은 " + c + "이고 " + "나머지는 " + d + "입니다." );
		} 
		else {
			int c = b / a; // 몫
			int d = b % a; // 나머지
			System.out.println(b + "을(를) " + a + "으로 " + "나눈 몫은 " + c + "이고 " + "나머지는 " + d + "입니다." );
		}
	}
}
// 두 개의 정수를 받아서 큰 수를 작은 수로 나눈 몫과 나머지를 출력하는 프로그램