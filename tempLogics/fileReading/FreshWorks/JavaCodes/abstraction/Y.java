package fileReading.FreshWorks.JavaCodes.abstraction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Y {

  public static void main(String[] args) {
    String[] ar = {"abc", "def"};
    List<String> arrList = Arrays.asList(ar);
    String res = arrList.stream().collect(Collectors.joining("||"));
    System.out.println(res);
    String[] spl = res.split("||");
    for (String s :
      spl) {
      System.out.println(s);
    }
  }
}
