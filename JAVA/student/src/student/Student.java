package student;

public class Student {
	public String name;
	public String address;
	public String phone;
	public String email;
	// 인스턴스 변수를 선언
	public Student(String name) {
		this.name = name;
	} // name을 받아서 인스턴스 변수에 할당해주는 생성자 
	public Student(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	} // 모든 정보를 받아서 인스턴스 변수에 할당해주는 생성자
	public String toString() {
		return name+" "+address+" "+phone+" "+email;
	} // 학생의 정보들을 String으로 리턴하는 메소드
}
