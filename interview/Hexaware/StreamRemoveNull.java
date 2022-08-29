package Interview.Hexaware;

import java.util.ArrayList;

public class StreamRemoveNull {
  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    al.add("9842482");
    al.add("99999");
    al.add("985555");
    al.add("00");
    al.add("999");
    al.add(null);

    al.stream().filter(i -> i!=null).filter(str -> str.startsWith("00")).forEach(System.out::println);
  }
}
