package Interview.Hexaware;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HexawareStream1 {
  public static void main(String[] args) {

    ArrayList<String> list = new ArrayList<>();
    list.add("Java");
    list.add("Java");
    list.add("Python");
    list.add("Go");

    Map<String, Integer> counterMap = list.stream()
      .collect(Collectors.toMap(Function.identity(), value -> 1, Integer::sum));

    System.out.println(counterMap);

    List<Integer> al = new ArrayList<>();
    al.add(3);
    al.add(5);
    al.add(2);
    al.add(9);
    al.add(8);
    int res = al.stream().filter(i -> i % 2 == 0).mapToInt(i -> i * i).sum();
    System.out.println(res);

  }
}
