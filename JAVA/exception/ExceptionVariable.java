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
		int[] intArray = null; // ��ü �迭 ����
		try {
			intArray=new int[5]; // ��ü �迭 ����. try��� �Ȱ� �ۿ��� ��ü �迭�� ����� ������ �����ϱ�. 
			System.out.println(intArray[5]);
		} catch (Exception e) {
			System.out.println(intArray.length);
		}
		System.out.print("This code must run");
	}
}
