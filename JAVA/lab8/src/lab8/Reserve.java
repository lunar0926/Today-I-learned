package lab8;
import java.util.*;

public class Reserve {
	public static void main(String[] args) {
		int[] seats = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.println("좌석을 예약하시겠습니까?(1 또는 0) ");
			int answer = s.nextInt();
			if (answer == 0) break;
			System.out.println("현재의 예약 상태는 다음과 같습니다.");
			System.out.println("--------------------------");
			System.out.println("1 2 3 4 5 6 7 8 9 10");
			System.out.println("--------------------------");
			for (int x : seats) {
				System.out.print(x + " ");
			}
			System.out.println();
			System.out.println("몇번째 좌석을 예약하시겠습니까? ");
			int idx = s.nextInt();
			if (seats[idx-1] == 1) {
				System.out.println("이미 예약된 자리입니다. ");
			}
			else {
				seats[idx-1] = 1;
				System.out.println("예약되었습니다.");
			}
		}
	}
}
