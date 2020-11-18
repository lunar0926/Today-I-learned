package lab3;

public class Dog {
	private String name;
	public String breed;
	private int age;
	
	Dog(String name, int age) {
		this.name=name;
		this.age=age;
		this.breed=null;
	} // 이름, 나이를 초기화하는 생성자
	Dog(String name, String breed, int age) {
		this.name=name;
		this.breed=breed;
		this.age=age;
	} // 이름, 종류, 나이를 초기화하는 생성자
}
