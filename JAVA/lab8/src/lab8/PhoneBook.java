package lab8;
import java.util.*;
public class PhoneBook {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("인원수>>>");
		int number = scan.nextInt();
		Phone[] p = new Phone[number]; // Phone 클래스의 객체 배열 생성
		
		for (int i=0; i < p.length; i++) {
			System.out.print("이름과 전화번호(이름과 번호는 빈칸없이 입력)>>");
			String name = scan.next();
			String tel = scan.next();
			p[i] = new Phone(name, tel);
		}
		System.out.println("저장되었습니다...");
		int check = 0; // 입력한 이름과 배열에서의 이름이 겹치는지 확인하는 변수
		while(true) {
			System.out.print("검색할 이름>>");
			String a = scan.next();
			
			for (int j=0; j < p.length; j++) {
				if(a.equals(p[j].getName())) {
					System.out.println(p[j].getName() + "의 번호는 " + p[j].getTel() + "입니다.");
					check = 1; // 입력한 이름이 전화번호부에 있으면 1
				}
			}
			if(check == 0 && a != "그만") {
				System.out.println(a + " 이 없습니다.");
			}
			if(a.equals("그만")) {
				break; // "그만"을 입력하면 프로그램 종료
			}
		}
		scan.close();
	}
}
