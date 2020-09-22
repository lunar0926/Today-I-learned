package ch5;
import java.util.Scanner; // 입력 보조 클래스

public class Introduce {
	public static void main(String[] args) {
		
		String name;
		int age;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름: ");
		name = scan.next();
		System.out.print("나이: ");
		age = scan.nextInt();
		System.out.println("이름은 " + name + "이고 나이는 " + age +"세입니다." );
	}
}
