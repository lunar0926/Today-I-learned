public class ReferenceStatic {
    String name="Min"; // static이 붙어있지 않은 인스턴스 변수
    
    public static void main(String[] args) {
        ReferenceStatic.staticMethod();
    }
    public static void staticMethod() {
        System.out.println("This is a staticMethod");
    }
    public static void staticMethodCallVariable() {
        System.out.println(name);
    }
}

// static 메소드는 클래스 변수만을 사용할 수 있음을 보여주는 코드.