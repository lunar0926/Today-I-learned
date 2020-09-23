package c.javapackage;

import c.javapackage.sub.Sub; // 다른 패키지에 있는 클래스를 import

public class Package {
  public static void main(String[] args) {
    // System.out.println("Package class.");
    Sub sub = new Sub();
    sub.subClassMethod();
    }
}