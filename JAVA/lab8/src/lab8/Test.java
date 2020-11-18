package lab8;

public class Test {
	public static void main(String[] args) {
		double[] d = {1.0, 2.0, 3.0, 4.0};
		double sum = 0, max = 0, min = 100;
		for (int i=0; i < d.length; i++) {
			System.out.print(d[i] + " ");
			sum += d[i];
			if (d[i] > max) {
				max = d[i];
			}
			if (d[i] < min) {
				min = d[i];
			}
		}
		System.out.println();
		System.out.println("ÇÕÀº " + sum);
		System.out.println("ÃÖ´ñ°ªÀº " + max);
		System.out.println("ÃÖ¼Ú°ªÀº " + min);
		String[] s1 = new String[3];
		s1[0] = "Hello";
		s1[1] = "Java";
		s1[2] = "World";
		for (String s2: s1) {
			System.out.println(s2);
		}
	}
}