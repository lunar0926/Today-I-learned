package ch5;
import java.util.Scanner;

public class PiggyBank {
	public static void main(String[] args) {
		int a; // 10원
		int b; // 50원
		int c; // 100원
		int d; // 500원
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("10원의 개수를 입력하시오: ");
		a = scan.nextInt();
		System.out.print("50원의 개수를 입력하시오: ");
		b = scan.nextInt();
		System.out.print("100원의 개수를 입력하시오: ");
		c = scan.nextInt();
		System.out.print("500원의 개수를 입력하시오: ");
		d = scan.nextInt();
		
		int sum = (a*10) + (b*50) + (c*100) + (d*500);
		System.out.println("저금통에 들어있는 돈의 총합은: " + sum +"원");
		
	}

}
