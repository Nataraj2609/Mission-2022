package Interview.FullForce.DataStructure.codingEverything.LLArrayString.String;

public class ReverseInteger {
  public static void main(String[] args) {
    System.out.println(reverse(123));
  }

  private static int reverse(int num) {
    int res = 0;
    while (num > 0) {
      res = (res * 10) + num % 10;
      num /= 10;
    }

    return res;
  }
}
