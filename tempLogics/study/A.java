package study;

public class A {
  void m1() throws NullPointerException{
    System.out.println("NULL");
  }
}
class B extends A{
  void m1() throws IndexOutOfBoundsException{
    System.out.println("Index");
  }

  public static void main(String[] args) {
    A a = new B();
    a.m1();
  }
}
