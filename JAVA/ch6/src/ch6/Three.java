package ch6;
import java.util.*;

public class Three {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("������ �ϳ��� �Է����ּ���: ");
		String s = scan.next();
		char c = s.charAt(0);
		
		/*
		if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
			System.out.println("�����Դϴ�.");
		}
		else 
			System.out.println("�����Դϴ�.");
			*/
		switch(c) {
		case 'a' : 
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
			System.out.println("�����Դϴ�.");
			break;
		default :
			System.out.println("�����Դϴ�.");
			
		}
		
			
		
			
	}

}
