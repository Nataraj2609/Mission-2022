package study.Arrays;

import java.util.Arrays;

public class EnumClass {
  enum COLOR{
    red,
    blue,
    yellow
  }

  public static void main(String[] args) {
    String[] arr = new String[3];
    arr[0] = (COLOR.red.toString());
    System.out.println(Arrays.stream(arr).findFirst());
  }
}
