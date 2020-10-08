package ch6;
import java.util.*;

public class Problem1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("연산>>");
		double operand1 = scan.nextDouble();
		String s = scan.next();
		double operand2 = scan.nextDouble();
		double result;
		
		if(s.equals("+")) {
			result = operand1 + operand2;
			System.out.println(operand1 + "+" + operand2 + "의 계산 결과는 " + result);
		}
		else if(s.equals("-")) {
			result = operand1 - operand2;
			System.out.println(operand1 + "-" + operand2 + "의 계산 결과는 " + result);
		}
		else if(s.equals("*")) {
			result = operand1 * operand2;
			System.out.println(operand1 + "*" + operand2 + "의 계산 결과는 " + result);
		}
		else if(s.equals("/") && operand1 != 0 && operand2 != 0) {
			result = operand1 / operand2;
			System.out.println(operand1 + "/" + operand2 + "의 계산 결과는 " + result);
		}
		else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
	}

}
