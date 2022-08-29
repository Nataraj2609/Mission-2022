package Interview.FullForce.DataStructure.codingEverything;

public class FactorialUsingRecursion {

  public static void main(String[] args) {
    // Fact(4) = 1*2*3*4 = 24
    System.out.println(factRec(4));
  }

  private static int factRec(int n) {
    if(n == 1)
      return 1;
    return n * factRec(n-1);
  }
}
