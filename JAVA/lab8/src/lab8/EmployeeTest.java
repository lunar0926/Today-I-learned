package lab8;
import java.util.*;
public class EmployeeTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		Employee[] e = new Employee[s];
		for (int i=0; i < e.length; i++) {
			System.out.println("��� �̸�: ");
			String name = scan.next();
			System.out.println("�ּ�: ");
			String address = scan.next();
			System.out.println("����: ");
			int salary = scan.nextInt();
			System.out.println("�޴��� ��ȣ: ");
			String tel = scan.next();
			e[i] = new Employee(name, address, salary, tel);
		}
		for (Employee ee : e) {
			System.out.println(ee.getName() + " " + ee.getAddress() + " " + ee.getSalary() + " " + ee.getTel());
		}
	}

}
