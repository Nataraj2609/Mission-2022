package study.Prog2;

import java.util.ArrayList;
import java.util.List;

public class UnderstandingAL {
  public static void main(String[] args) {
    List<Integer> al = new ArrayList<>();
    al.add(3);
    al.add(3);
    al.add(3);
    UnderstandingAL aa = new UnderstandingAL();
    aa.myM(al);
    System.out.println(al);
  }

  List<Integer> myM(List<Integer> l) {
    l.add(99);
    return l;
  }
}
