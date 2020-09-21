public class ReferenceReturn {
    public static void main(String[] args) {
        ReferenceReturn reference = new ReferenceReturn();
        System.out.println(reference.intReturn());
        System.out.println(reference.intArrayReturn());
        System.out.println(reference.stringReturn());
    }
    public int intReturn() {
        int returnInt = 0;
        return returnInt;
    }
    public int[] intArrayReturn() {
        int returnArray[]=new int[10];
        return returnArray;
    }
    public String stringReturn() {
        String returnString="Return Value";
        return returnString;
    }
}
/* 
자바에서는 모든 타입을 한 개만 리턴 타입으로 넘겨줄 수 있다.
*/