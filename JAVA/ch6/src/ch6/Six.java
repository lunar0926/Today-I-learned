package ch6;
import java.util.*;

public class Six {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.print("������ �Է��Ͻÿ�>> ");
		n = scan.nextInt();
		int x = n;
		
		for (int i = 1; i <= x ; i++) { // ���� ��
			for (int j = 1; j <= n; j++) { // ���� �� ����
				System.out.print("*");
			}
			n--;
			System.out.println("");
		}
	}

}
