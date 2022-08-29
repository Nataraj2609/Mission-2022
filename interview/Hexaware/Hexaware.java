package Interview.Hexaware;

public class Hexaware {
  public static void main(String[] args) {
    Object o = null;
    method(java.util.Optional.ofNullable(null), null);
  }

  private static void method(Object o, Object o1) {
    System.out.println("Null called");
  }
  private static void method(String o, String o1) {
    System.out.println("String");
  }
  private static void method(Integer o, Integer o1) {
    System.out.println("Integer");
  }

}
