package ch5;
import java.util.Scanner; // �Է� ���� Ŭ����

public class Introduce {
	public static void main(String[] args) {
		
		String name;
		int age;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̸�: ");
		name = scan.next();
		System.out.print("����: ");
		age = scan.nextInt();
		System.out.println("�̸��� " + name + "�̰� ���̴� " + age +"���Դϴ�." );
	}
}
