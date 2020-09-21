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
		
		jaehyeong(a, b); // pass By Value�� jaehyeong �޼ҵ忡 �Ű������� ������ ��. �̸��� �ǹ� ����.
		System.out.println("after passByValue");
		System.out.println("a="+a);
		System.out.println("b="+b);
	}
	public void jaehyeong(int a, String b) {
		a=20;
		b="z"; // String�� �̷��� ����ǥ�� ���� �Ҵ��ϸ� new�� �̿��Ͽ� ��ü�� ������ �Ͱ� ����. �� �޼ҵ忡�� �� �ϳ��� ��ü�� ������ �Ͱ� ����.
		System.out.println("in passByValue");
		System.out.println("a="+a);
		System.out.println("b="+b);
	} // pass by value�� ���� �����ϴ� ����. �⺻ �ڷ����� ���� ���ؼ��� ȣ��Ǳ� ���� ���� �����Ͱ� ������� ����.
	
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
