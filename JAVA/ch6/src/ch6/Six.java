package ch6;
import java.util.*;

public class Six {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.print("정수를 입력하시오>> ");
		n = scan.nextInt();
		int x = n;
		
		for (int i = 1; i <= x ; i++) { // 세로 줄
			for (int j = 1; j <= n; j++) { // 가로 별 개수
				System.out.print("*");
			}
			n--;
			System.out.println("");
		}
	}

}
