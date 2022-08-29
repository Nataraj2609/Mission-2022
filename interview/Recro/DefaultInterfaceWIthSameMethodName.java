package Interview.Recro;

interface A {
  default void demo() {
    System.out.println("A");
  }
}

interface B {
  void demo();
}

public class DefaultInterfaceWIthSameMethodName implements A, B {
  public void demo() {
    System.out.println("Hello World");
  }

  public static void main(String[] args) {
    DefaultInterfaceWIthSameMethodName d = new DefaultInterfaceWIthSameMethodName();
    d.demo();
  }
}
