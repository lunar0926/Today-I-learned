package ch6;
import java.util.*;

public class One {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a, b, c;
		System.out.print("������ �Է��Ͻÿ�: ");
		a = scan.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		b = scan.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		c = scan.nextInt();
		
		if (a < b) {
			if(a < c) {
				System.out.println("���� ���� ����: " +a);
			}
		}
		else { // a > b �� ���
			if(b < c) {
				System.out.println("���� ���� ����: " +b);
			}
		}
	}
}
