public class MemberDTO {
  public String name;
  public String phone;
  public String email;
  public MemberDTO() {
    
  }
  public MemberDTO(String name) {
    this.name = name; // ��ü���� �Ű������� ���� ���� �ν��Ͻ� ������ this.name�� ���ٴ� ǥ��. this�� �Ű������� �ν��Ͻ������� �������� ���� �� �ν��Ͻ� ������ ����Ŵ.
  }
  public MemberDTO(String name, String phone) {
    this.name = name;
    this.phone = phone;
  }
  public MemberDTO(String name, String phone, String email) {
    this.name = name;
    this.phone = phone;
    this.email = email;
  }
}