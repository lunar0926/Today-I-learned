package ch6;

public class Four {
	public static void main(String[] args) {
		/*
		int sum1 = 0;
		int sum2 = 0;
		
		for (int t = 1; t <= 33; t++) {
			int three = 3 * t;
			sum1 += three;
		}
		for (int f = 1; f <= 25; f++) {
			int four = 4 * f;
			sum2 += four;
		}
		System.out.println("3 �Ǵ� 4�� ����� ��= " +(sum1+sum2));
		*/  
		// �̰� ������� �ߺ��ؼ� �����ϱ� ������ ���� �� ũ�� ������ ��. 
		
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 || i % 4 == 0) {
				sum += i;
			}
		}
		System.out.println("3 �Ǵ� 4�� ����� ��=" + sum);
	}
}
