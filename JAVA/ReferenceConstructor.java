public class ReferenceConstructor {
  public static void main(String [] args) {
    ReferenceConstructor reference = new ReferenceConstructor();
    reference.makeMemberObject(); // ��ü�� ����� �޼ҵ�
  }
  public void makeMemberObject() {
    MemberDTO dto1 = new MemberDTO();
    MemberDTO dto2 = new MemberDTO("Jaehyeong");
    MemberDTO dto3 = new MemberDTO("Jaehyeong", "010XXXXYYYY");
    MemberDTO dto4 = new MemberDTO("Jaehyeong", "010XXXXYYYY", "lunar0926@gmail.com");
 }
}