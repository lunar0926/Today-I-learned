package ch5;
import java.util.Scanner; // �Է� ���� Ŭ����

public class Pressure {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double P; // ���� ũ��
		double S; // ��ü�� ����
		double p; // �з��� ����
		
		System.out.print("���� ũ���: ");
		P = scan.nextDouble();
		System.out.print("��ü�� ���̴�: ");
		S = scan.nextDouble();
		p = P / S;
		System.out.println("�з��� ����: " + p);
		
	}

}
