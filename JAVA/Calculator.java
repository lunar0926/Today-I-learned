package exception;

public class Calculator {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		try {
			calc.printDivide(1,2);
			calc.printDivide(1, 0);
		} catch (Exception e){
			System.out.println(e.getMessage()); // 예외메시지만 출력하도록 getMessage() 메소드 사용
		}
		
	}
	public void printDivide(double d1, double d2) throws Exception {
		double result = d1/d2;
		if (d2 == 0) {
			throw new Exception("Second value can't be Zero");
		}
		System.out.println(result);
	} // throw를 쓸 때와 throws를 쓸 때를 구분. 
}
