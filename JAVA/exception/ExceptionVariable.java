package exception;

public class ExceptionVariable {

	public static void main(String[] args) {
		ExceptionVariable sample = new ExceptionVariable();
		sample.checkVariable2();
	}
	/*
	public void checkVariable() {
		int[] intArray=new int[5];
		try {
			System.out.println(intArray[5]);
		} catch (Exception e) {
			System.out.println(intArray.length);
		}
		System.out.print("This code must run");
	}
	*/
	public void checkVariable2() {
		int[] intArray = null; // 객체 배열 선언
		try {
			intArray=new int[5]; // 객체 배열 생성. try블록 안과 밖에서 객체 배열의 선언과 생성을 구분하기. 
			System.out.println(intArray[5]);
		} catch (Exception e) {
			System.out.println(intArray.length);
		}
		System.out.print("This code must run");
	}
}
