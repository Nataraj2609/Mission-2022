package Interview.Recro;

import java.util.ArrayList;
import java.util.List;

public class StreamFindFirst {
  public static void main(String[] args) {
    List<String> strList = new ArrayList<>();
    strList.add("d world");
    strList.add("hello john");
    strList.add("hi world");
    strList.add("hello Nataraj");

    String s = strList.stream().filter(str -> str.contains("hello")).findFirst().get();
    System.out.println(s);
  }
}
