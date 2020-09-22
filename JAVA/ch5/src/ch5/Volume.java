package ch5;
import java.util.Scanner;

public class Volume {
	public static void main(String[] args) {
		byte length; // 가로 
		byte width; // 세로
		byte height; // 높이
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("길이를 입력해주세요: ");
		length = scan.nextByte();
		System.out.print("너비를 입력해주세요: ");
		width = scan.nextByte();
		System.out.print("높이를 입력해주세요: ");
		height = scan.nextByte();
		
		int result;
		result = length * width * height;
		System.out.println("상자의 체적(부피)는 " + result);
	}

}
