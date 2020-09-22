package ch5;
import java.util.Scanner; // 입력 보조 클래스

public class Pressure {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double P; // 힘의 크기
		double S; // 물체의 넓이
		double p; // 압력의 세기
		
		System.out.print("힘의 크기는: ");
		P = scan.nextDouble();
		System.out.print("물체의 넓이는: ");
		S = scan.nextDouble();
		p = P / S;
		System.out.println("압력의 세기: " + p);
		
	}

}
