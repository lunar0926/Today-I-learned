package ch6;
import java.util.*;

public class Problem2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("����>>");
		double operand1 = scan.nextDouble();
		String s = scan.next();
		double operand2 = scan.nextDouble();
		double result;
		
		switch(s) {
		case "+":
			result = operand1 + operand2;
			System.out.println(operand1 + "+" + operand2 + "�� ��� ����� " + result);
			break;
		case "-":
			result = operand1 - operand2;
			System.out.println(operand1 + "-" + operand2 + "�� ��� ����� " + result);
			break;
		case "*":
			result = operand1 * operand2;
			System.out.println(operand1 + "*" + operand2 + "�� ��� ����� " + result);
			break;
		case "/":
			if (operand1 != 0 && operand2 != 0) {
				result = operand1 / operand2;
				System.out.println(operand1 + "/" + operand2 + "�� ��� ����� " + result);
			}
			else 
				System.out.println("0���� ���� �� �����ϴ�.");
			break;	
		}
	}

}
