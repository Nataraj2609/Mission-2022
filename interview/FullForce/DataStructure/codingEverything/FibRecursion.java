package Interview.FullForce.DataStructure.codingEverything;

public class FibRecursion {
  public static void main(String[] args) {
    // 1 1 2 3 5 8 13 21

    for (int i = 1; i <= 10; i++) {
      System.out.println(printFibRec(i));
    }
  }

  private static int printFibRec(int n) {
    if (n <= 1) {
      return n;
    }
    return printFibRec(n - 1) + printFibRec(n - 2);
  }
}
