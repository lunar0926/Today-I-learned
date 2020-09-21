public class ReferenceOverloading {
    public static void main(String args[]) {
        ReferenceOverloading reference = new ReferenceOverloading();
    }
    public void print(int data) {
        
    }
    public void print(String data) {
        
    }
    public void print(int intData, String stringData) {
        
    }
    public void print(String stringData, int intData) {
        
    } 
 /* 3, 4번째 메소드의 매개변수는 순서가 다름. 
 순서가 다르면 다른 메소드처럼 인식된다. 타입의 순서가 달라야 다른 것으로 인식함.
 */
}
