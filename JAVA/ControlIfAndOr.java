public class ControlIfAndOr {
    public static void main(String[] args) {
        ControlIfAndOr control=new ControlIfAndOr();
        control.ifAndOr();
    }
    public void ifAndOr() {
        int age = 25;
        boolean isMarried = true;
        
        if (age > 25 && isMarried) {
            System.out.println("Age is over 25 and Married");
        }
        if (age > 25 || isMarried) {
            System.out.println("Age is over 25 or Married"); // int age = 25 이기 때문에 or 만 조건 성립 
        }
    }
}