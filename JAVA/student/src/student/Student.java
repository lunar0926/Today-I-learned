package student;

public class Student {
	public String name;
	public String address;
	public String phone;
	public String email;
	// �ν��Ͻ� ������ ����
	public Student(String name) {
		this.name = name;
	} // name�� �޾Ƽ� �ν��Ͻ� ������ �Ҵ����ִ� ������ 
	public Student(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	} // ��� ������ �޾Ƽ� �ν��Ͻ� ������ �Ҵ����ִ� ������
	public String toString() {
		return name+" "+address+" "+phone+" "+email;
	} // �л��� �������� String���� �����ϴ� �޼ҵ�
}
