package ch5;
import java.util.Scanner; // �Է� ���� Ŭ����

public class Thales {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		// �� ���� ���� ����
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
		DE = (AE * BC) / AC; // �ﰢ���� ������ ���ؼ� DE�� ���ϴ� ��
		System.out.println("DE�� ����: " + DE);
	}
}
