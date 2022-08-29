package important_stuffs.RecallDS.NullCheck;

public class Test {
  public static void main(String args[]) {
    Parent p = new Child();
    p.foo();
  }
}
class Parent {

  protected void foo() {
    System.out.println("this is parent");
  }
}
class Child extends Parent{
  public void foo() {
    System.out.println("this is child");
  }
}