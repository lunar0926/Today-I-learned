package ch5;

public class Light {

	public static void main(String[] args) {
		final double distance = 15E+7; 
		final double speed = 3E+5; // 기호 상수는 변수 선언 앞에 키워드 final을 붙임.
		
		double time = distance / speed;
		System.out.println("빛이 태양에서 지구에 도착하는 시간: " + time + " 초");
	}

}
