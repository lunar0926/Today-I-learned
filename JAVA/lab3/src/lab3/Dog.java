package lab3;

public class Dog {
	private String name;
	public String breed;
	private int age;
	
	Dog(String name, int age) {
		this.name=name;
		this.age=age;
		this.breed=null;
	} // �̸�, ���̸� �ʱ�ȭ�ϴ� ������
	Dog(String name, String breed, int age) {
		this.name=name;
		this.breed=breed;
		this.age=age;
	} // �̸�, ����, ���̸� �ʱ�ȭ�ϴ� ������
}
