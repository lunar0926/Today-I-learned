public class ProfilePrint {
    int age;
    String name;
    boolean isMarried; // 인스턴스 변수
    public static void main(String[] args) {
        ProfilePrint profile = new ProfilePrint(); // 객체 생성
        profile.setAge(24);
        profile.setName("Jaehyeong");
        profile.setMarried(false);
        profile.getAge();
        profile.getName();
        profile.isMarried();
    }
    public void setAge(int paraAge) {
        age = paraAge;
    }
    public void getAge() {
        System.out.println("My age is="+age);
    }
    public void setName(String paraName) {
        name = paraName;
    }
    public void getName() {
        System.out.println("My name is="+name);
    }
    public void setMarried(boolean flag) {
        isMarried = flag;
    }
    public void isMarried() {
        System.out.println("I'm married.="+isMarried);
    }
}