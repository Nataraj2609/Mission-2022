package study.morgnStanley;

public class Test {
  private static void function(int n) {
    if (n > 0)
      function(n - 1);
    System.out.print(n);
  }

  public static void main(String[] args) {
    function(5);
  }
}
