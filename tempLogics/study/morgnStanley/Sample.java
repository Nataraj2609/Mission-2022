package study.morgnStanley;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sample {
  public static void main(String[] args) {
    final ArrayList<Integer> j = new ArrayList<>();
    j.add(22);
    System.out.println(j);
    j.set(0,12);
    System.out.println(j);
    Collections.unmodifiableList(j);
    j.set(0,2222);
    System.out.println(j);
  }
}
