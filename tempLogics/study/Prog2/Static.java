package study.Prog2;

import java.util.HashMap;
import java.util.Map;

public class Static {

  public static void main(String[] args) {
    String s = "abc";
    my(s);
    System.out.println(s);
    Map<Integer, String> h = new HashMap<Integer, String>();
  }

  public static void my(String s) {
    s="dede";
    System.out.println(s);
  }
}
