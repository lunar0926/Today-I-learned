package lab8;
import java.util.*;

public class Reserve {
	public static void main(String[] args) {
		int[] seats = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("�¼��� �����Ͻðڽ��ϱ�?(1 �Ǵ� 0) ");
			int answer = s.nextInt();
			if (answer == 0) break;
			System.out.println("������ ���� ���´� ������ �����ϴ�.");
			System.out.println("--------------------------");
			System.out.println("1 2 3 4 5 6 7 8 9 10");
			System.out.println("--------------------------");
			for (int x : seats) {
				System.out.print(x + " ");
			}
			System.out.println();
			System.out.println("���° �¼��� �����Ͻðڽ��ϱ�? ");
			int idx = s.nextInt();
			if (seats[idx-1] == 1) {
				System.out.println("�̹� ����� �ڸ��Դϴ�. ");
			}
			else {
				seats[idx-1] = 1;
				System.out.println("����Ǿ����ϴ�.");
			}
		}
	}
}
