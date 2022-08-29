package study.Prog2;

class A {
  public void methodA(){
    System.out.println("Hello World");
  }
}
class B extends A{
  public void MethodA(){
    System.out.println("Hi there");
  }
}
class ParentChild1{
  public static void main(String[] args) {
    A a = new B();
    a.methodA();
    String arr[] = {"a","b","c"};
  }
}
