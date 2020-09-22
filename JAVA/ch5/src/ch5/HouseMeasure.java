package ch5;
import java.util.Scanner;

public class HouseMeasure {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double 평;
		double 평방미터;
		
		System.out.print("평 수를 입력하시오: ");
		평 = scan.nextDouble();
		평방미터 = 평 * 3.3058;
		
		System.out.println(평 + " 평은 " + 평방미터 + "㎡");
	}
}
