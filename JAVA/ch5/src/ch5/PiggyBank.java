package ch5;
import java.util.Scanner;

public class PiggyBank {
	public static void main(String[] args) {
		int a; // 10��
		int b; // 50��
		int c; // 100��
		int d; // 500��
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("10���� ������ �Է��Ͻÿ�: ");
		a = scan.nextInt();
		System.out.print("50���� ������ �Է��Ͻÿ�: ");
		b = scan.nextInt();
		System.out.print("100���� ������ �Է��Ͻÿ�: ");
		c = scan.nextInt();
		System.out.print("500���� ������ �Է��Ͻÿ�: ");
		d = scan.nextInt();
		
		int sum = (a*10) + (b*50) + (c*100) + (d*500);
		System.out.println("�����뿡 ����ִ� ���� ������: " + sum +"��");
		
	}

}
