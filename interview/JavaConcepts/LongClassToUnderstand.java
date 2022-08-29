package Interview.FullForce.JavaConcepts;

public class LongClassToUnderstand {
  public static void main(String[] args) {
    Long l = 2l;
    String s = "2";

    if (l.equals(Long.valueOf(s))) {
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }

  }
}
