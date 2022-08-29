package study.inheritance;

public class Child extends Parent {
   String m1() {
    return "Child m1";
  }

  @Override
  public String m2() {
    return "Child m2";
  }

  public static void main(String[] args) {
    Parent p = new Parent();
    System.out.println(p.m1());
    System.out.println(p.m2());
    Parent c  = new Child();
    System.out.println(c.m1());
    System.out.println(c.m2());
  }
}
