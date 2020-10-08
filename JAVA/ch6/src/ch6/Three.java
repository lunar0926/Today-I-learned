package ch6;
import java.util.*;

public class Three {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("영문자 하나를 입력해주세요: ");
		String s = scan.next();
		char c = s.charAt(0);
		
		/*
		if ( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
			System.out.println("모음입니다.");
		}
		else 
			System.out.println("자음입니다.");
			*/
		switch(c) {
		case 'a' : 
		case 'e' :
		case 'i' :
		case 'o' :
		case 'u' :
			System.out.println("모음입니다.");
			break;
		default :
			System.out.println("자음입니다.");
			
		}
		
			
		
			
	}

}
