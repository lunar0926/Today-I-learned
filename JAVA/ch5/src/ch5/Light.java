package ch5;

public class Light {

	public static void main(String[] args) {
		final double distance = 15E+7; 
		final double speed = 3E+5; // ��ȣ ����� ���� ���� �տ� Ű���� final�� ����.
		
		double time = distance / speed;
		System.out.println("���� �¾翡�� ������ �����ϴ� �ð�: " + time + " ��");
	}

}
