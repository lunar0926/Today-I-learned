public class MemberDTO {
  public String name;
  public String phone;
  public String email;
  public MemberDTO() {
    
  }
  public MemberDTO(String name) {
    this.name = name; // 객체에서 매개변수를 받은 것이 인스턴스 변수인 this.name과 같다는 표시. this는 매개변수와 인스턴스변수의 변수명이 같을 때 인스턴스 변수를 가리킴.
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