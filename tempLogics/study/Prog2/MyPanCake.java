package study.Prog2;

import java.util.ArrayList;
import java.util.List;

public class MyPanCake {
  public static void main(String[] args) {
    List<String> x = new ArrayList<>();
    x.add("3");
    x.add("7");
    x.add("5");
    List<String> y = new MyPanCake().doStuff(x);
    y.add("1");
    System.out.println(x);
  }

  List<String> doStuff(List<String> z) {
    z.add("9");
    return z;
  }
}
