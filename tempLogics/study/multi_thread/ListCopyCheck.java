package study.multi_thread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListCopyCheck {
  public static void main(String[] args) {
    List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3));
    List<Integer> l2 = new ArrayList<>(Arrays.asList(6,7,8,9,10));
    Collections.copy(l2,l1);
    for (int i :
      l2) {
      System.out.println(i);
    }
  }
}
