package lab8;
import java.util.*;
public class Test2 {

	public static void main(String[] args) {
		int[] count = new int[10];
		for (int x : count) {
			x = 0;
		}
		Scanner input = new Scanner(System.in);
		System.out.print("정수 10개를 입력해주세요. ");
		for(int i=0; i < count.length; i++) {
			int value = input.nextInt();
			count[(value-1)/10]++;
			
		}
		for (int i=0; i <count.length; i++) {
			System.out.print((i*10+1) + "-" + (i+1)*10 + " ");
			for (int j=0; j < count[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
