package lab9;

public class Student extends Human {
	private String major;
	
	public Student(String name, int age, String major) {
		super(name, age); // 변수가 private하기 때문에 super클래스의 생성자를 통해서 호출
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Student [major=" + major + "]";
	} // 부모클래스의 toString()을 호출하는 방법
	
	
	
	@Override
	public String getProfession() {
		// TODO Auto-generated method stub
		return "학생";
	}

	public static void main(String[] args) {
		Student s1 = new Student("명진", 21, "컴퓨터");
		Student s2 = new Student("미현", 22, "경영");
		Student s3 = new Student("용준", 24, "경영");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		System.out.println(s1.name);
		System.out.println(s1.getProfession());
		
		System.out.println();
		Student[] slist = new Student[3];
		slist[0] = new Student("명진", 21, "컴퓨터");
		slist[1] = new Student("미현", 22, "경영");
		slist[2] = new Student("용준", 24, "경영");
		for (Student s : slist) {
			System.out.println(s);
		}
		// 배열로 출력해보기
	}
	
}
