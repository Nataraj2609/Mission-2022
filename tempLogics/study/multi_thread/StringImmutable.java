package study.multi_thread;

public class StringImmutable {
  public static void main(String[] args) {
//    String s1 = "Hello";
//    String s2 = s1;
//    System.out.println(s1);
//    System.out.println(s2);
//    s1 = "John";
//    System.out.println(s1);
//    System.out.println(s2);

    //To Prove Java is call by Value & not reference
    String s = "Postgres";
    int value = 3;
    System.out.println(s);
    System.out.println(value);
    StringImmutable i = new StringImmutable();
    i.changeMe(s, value);
    System.out.println(s);
    System.out.println(value);
  }

  private void changeMe(String s, int value) {
    s = "Changed to NEW";
    value = 5;
    ChangeAgain(s, value);
    System.out.println(s);
    System.out.println(value);
  }

  private void ChangeAgain(String s, int value) {
    s = "Changed to NEW again";
    value = 9;
  }
}
