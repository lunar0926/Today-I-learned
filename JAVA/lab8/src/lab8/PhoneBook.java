package lab8;
import java.util.*;
public class PhoneBook {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�ο���>>>");
		int number = scan.nextInt();
		Phone[] p = new Phone[number]; // Phone Ŭ������ ��ü �迭 ����
		
		for (int i=0; i < p.length; i++) {
			System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� ��ĭ���� �Է�)>>");
			String name = scan.next();
			String tel = scan.next();
			p[i] = new Phone(name, tel);
		}
		System.out.println("����Ǿ����ϴ�...");
		int check = 0; // �Է��� �̸��� �迭������ �̸��� ��ġ���� Ȯ���ϴ� ����
		while(true) {
			System.out.print("�˻��� �̸�>>");
			String a = scan.next();
			
			for (int j=0; j < p.length; j++) {
				if(a.equals(p[j].getName())) {
					System.out.println(p[j].getName() + "�� ��ȣ�� " + p[j].getTel() + "�Դϴ�.");
					check = 1; // �Է��� �̸��� ��ȭ��ȣ�ο� ������ 1
				}
			}
			if(check == 0 && a != "�׸�") {
				System.out.println(a + " �� �����ϴ�.");
			}
			if(a.equals("�׸�")) {
				break; // "�׸�"�� �Է��ϸ� ���α׷� ����
			}
		}
		scan.close();
	}
}
