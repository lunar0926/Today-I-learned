package ch5;
import java.util.Scanner;

public class Division {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		
		System.out.print("������ �Է��Ͻÿ�: ");
		a = scan.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		b = scan.nextInt();
		
		if(a > b) {
			int c = a / b; // ��
			int d = a % b; // ������
			System.out.println(a + "��(��) " + b + "���� " + "���� ���� " + c + "�̰� " + "�������� " + d + "�Դϴ�." );
		} 
		else {
			int c = b / a; // ��
			int d = b % a; // ������
			System.out.println(b + "��(��) " + a + "���� " + "���� ���� " + c + "�̰� " + "�������� " + d + "�Դϴ�." );
		}
	}
}
// �� ���� ������ �޾Ƽ� ū ���� ���� ���� ���� ��� �������� ����ϴ� ���α׷�