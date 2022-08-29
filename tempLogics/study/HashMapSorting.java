package study;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapSorting {
  public static void main(String[] args) {
    HashMap<String, Integer> hmap = new HashMap<>();
    hmap.put("1", 6666);
    hmap.put("2", 465);
    hmap.put("3", 62);
    hmap.put("-1", 333);
    hmap.put("0", 2);

    System.out.println(hmap);
    ArrayList<String> keyList = new ArrayList<>(hmap.keySet());
    Collections.sort(keyList, Collections.reverseOrder());
    System.out.println(keyList);

    Stream s = hmap.entrySet().stream().sorted(Map.Entry.comparingByKey());
    s.forEach(System.out::println);


  }

  public static <T> Set<T> findDuplicateBySetAdd(List<T> list) {

    Set<T> items = new HashSet<>();
    return list.stream()
      .filter(n -> !items.add(n)) // Set.add() returns false if the element was already in the set.
      .collect(Collectors.toSet());

  }


}
