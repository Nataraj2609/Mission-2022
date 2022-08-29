package study.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Array2 {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(3);
    al.add(3);
    al.add(3);

    Integer[] arr = new Integer[3];

    al.toArray(arr);
    Arrays.stream(arr).forEach(System.out::println);



  }
}
