package ch5;
import java.util.Scanner; // 입력 보조 클래스

public class Thales {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		// 각 선분 변수 선언
		double AC;
		double AE;
		double BC;
		
		System.out.print("AC: ");
		AC = scan.nextDouble();
		System.out.print("AE: ");
		AE = scan.nextDouble();
		System.out.print("BC: ");
		BC = scan.nextDouble();
		
		double DE;
		DE = (AE * BC) / AC; // 삼각형의 닮음비를 통해서 DE를 구하는 식
		System.out.println("DE의 길이: " + DE);
	}
}
