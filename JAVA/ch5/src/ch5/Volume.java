package ch5;
import java.util.Scanner;

public class Volume {
	public static void main(String[] args) {
		byte length; // ���� 
		byte width; // ����
		byte height; // ����
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���̸� �Է����ּ���: ");
		length = scan.nextByte();
		System.out.print("�ʺ� �Է����ּ���: ");
		width = scan.nextByte();
		System.out.print("���̸� �Է����ּ���: ");
		height = scan.nextByte();
		
		int result;
		result = length * width * height;
		System.out.println("������ ü��(����)�� " + result);
	}

}
