package reference;

public class ReferencePass {
	public static void main(String[] args) {
		ReferencePass reference = new ReferencePass();
		// reference.callPassByValue();
		reference.callPassByReference();
	}
	public void callPassByValue() {
		int a = 10;
		String b = "b";
		System.out.println("before passByValue");
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		jaehyeong(a, b); // pass By Value로 jaehyeong 메소드에 매개변수를 지정한 것. 이름은 의미 없음.
		System.out.println("after passByValue");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	public void jaehyeong(int a, String b) {
		a=20;
		b="z"; // String은 이렇게 따옴표로 값을 할당하면 new를 이용하여 객체를 생성한 것과 같음. 이 메소드에서 또 하나의 객체를 생성한 것과 같음.
		System.out.println("in passByValue");
		System.out.println("a="+a);
		System.out.println("b="+b);
	} // pass by value는 값을 전달하는 과정. 기본 자료형의 값에 대해서는 호출되기 전과 후의 데이터가 변경되지 않음.
	
	public void callPassByReference() {
		MemberDTO member = new MemberDTO("Jaehyeong");
		System.out.println("before passByReference");
		System.out.println("member.name="+member.name);
		passByReference(member);
		System.out.println("after passByReference");
		System.out.println("member.name="+member.name);
	}
	
	public void passByReference(MemberDTO member) {
		member.name = "Jaehoon";
		System.out.println("in passByReference");
		System.out.println("member.name="+member.name);
	}
}
