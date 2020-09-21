package student;

public class ManageStudent {
	public static void main(String[] args) {
		Student[] student = null; // student��� �̸��� ���� Student �迭. ������ �ʱ�ȭ�� �����ʰ� null �Ҵ�. Student Ÿ������ student ����.
		ManageStudent manage = new ManageStudent();
		student = manage.addStudent(); // addStudent �޼ҵ带 ȣ���Ͽ� ����� student ��ü�� ����
	    manage.printStudents(student); // student �迭�� ������ ������ ������ִ� �޼ҵ�.
		
	}
	public Student[] addStudent() {
		Student[] student = new Student[3];
		student[0] = new Student("Lim");
		student[1] = new Student("Min");
		student[2] = new Student("Sook", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
		return student;
	} // �л��� ������ ���� �� �����ϴ� �޼ҵ�.
	// Student[] �迭�� ��ü�� student�� return�ϴ� �޼ҵ�.
	 public void printStudents(Student[] student) {
		for(int i=0; i < student.length; i++) {
			System.out.println(student[i]);
		}
	}
} 
