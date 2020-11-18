package lab9;

public class Human {
	protected String name;
	private int age;
	

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	} // �Ű������� ������ �ʵ带 �ʱ�ȭ

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	// �� �ʵ忡 ���� �����ڿ� ������
	@Override // Override ù O �빮�ڷ� 
	public String toString() {
		return "Human [name= " + name + ", " + "age= " + age + "] ";
	} 
	public String getProfession() {
		return "����";
	}
	public static void main(String[] args) {
		Human h1 = new Human("����", 18);
		Human h2 = new Human("����", 21);
		Human h3 = new Human("���", 50);
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3); // �̷��� ǥ���ص� ��������
		System.out.println();
		
		Human [] list = new Human[3];
		list[0] = new Human("����", 18);
		list[1] = new Human("����", 21);
		list[2] = new Human("���", 50);
		for (Human h : list) {
			System.out.println(h);
		}
	}
}
