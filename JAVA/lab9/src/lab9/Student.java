package lab9;

public class Student extends Human {
	private String major;
	
	public Student(String name, int age, String major) {
		super(name, age); // ������ private�ϱ� ������ superŬ������ �����ڸ� ���ؼ� ȣ��
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
	} // �θ�Ŭ������ toString()�� ȣ���ϴ� ���
	
	
	
	@Override
	public String getProfession() {
		// TODO Auto-generated method stub
		return "�л�";
	}

	public static void main(String[] args) {
		Student s1 = new Student("����", 21, "��ǻ��");
		Student s2 = new Student("����", 22, "�濵");
		Student s3 = new Student("����", 24, "�濵");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		
		System.out.println(s1.name);
		System.out.println(s1.getProfession());
		
		System.out.println();
		Student[] slist = new Student[3];
		slist[0] = new Student("����", 21, "��ǻ��");
		slist[1] = new Student("����", 22, "�濵");
		slist[2] = new Student("����", 24, "�濵");
		for (Student s : slist) {
			System.out.println(s);
		}
		// �迭�� ����غ���
	}
	
}
