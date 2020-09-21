package student;

public class ManageStudent {
	public static void main(String[] args) {
		Student[] student = null; // student라는 이름을 갖는 Student 배열. 별도의 초기화를 하지않고 null 할당. Student 타입으로 student 선언.
		ManageStudent manage = new ManageStudent();
		student = manage.addStudent(); // addStudent 메소드를 호출하여 결과를 student 객체로 받음
	    manage.printStudents(student); // student 배열의 각각의 내용을 출력해주는 메소드.
		
	}
	public Student[] addStudent() {
		Student[] student = new Student[3];
		student[0] = new Student("Lim");
		student[1] = new Student("Min");
		student[2] = new Student("Sook", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
		return student;
	} // 학생의 정보를 담은 후 리턴하는 메소드.
	// Student[] 배열의 객체인 student를 return하는 메소드.
	 public void printStudents(Student[] student) {
		for(int i=0; i < student.length; i++) {
			System.out.println(student[i]);
		}
	}
} 
