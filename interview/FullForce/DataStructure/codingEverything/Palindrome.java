package Interview.FullForce.DataStructure.codingEverything;

public class Palindrome {
  public static void main(String[] args) {
    String s = "AbleelbA";
    System.out.println(isPalin(s));
  }

  private static boolean isPalin(String s) {
    int m = s.length() / 2;
    String l = null;
    if (s.length() % 2 != 0) {
      m++;
      l = s.substring(0, m - 1);
    } else {
      l = s.substring(0, m);
    }

    StringBuilder sb = new StringBuilder(s.substring(m));
    return l.equals(sb.reverse().toString());
  }
}
