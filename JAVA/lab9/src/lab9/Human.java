package lab9;

public class Human {
	protected String name;
	private int age;
	

	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	} // 매개변수의 값으로 필드를 초기화

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
	// 각 필드에 대한 접근자와 설정자
	@Override // Override 첫 O 대문자로 
	public String toString() {
		return "Human [name= " + name + ", " + "age= " + age + "] ";
	} 
	public String getProfession() {
		return "무직";
	}
	public static void main(String[] args) {
		Human h1 = new Human("춘향", 18);
		Human h2 = new Human("몽룡", 21);
		Human h3 = new Human("사또", 50);
		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3); // 이렇게 표기해도 문제없음
		System.out.println();
		
		Human [] list = new Human[3];
		list[0] = new Human("춘향", 18);
		list[1] = new Human("몽룡", 21);
		list[2] = new Human("사또", 50);
		for (Human h : list) {
			System.out.println(h);
		}
	}
}
