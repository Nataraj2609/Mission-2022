package study.morgnStanley;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MainTest {
  public static void main(String[] args) {
    HashMap<String, Integer> unsortedMap = new HashMap<>();
    unsortedMap.put("one", 1);
    unsortedMap.put("two", 2);
    unsortedMap.put("three", 3);
    unsortedMap.put("four", 4);
    unsortedMap.put("five", 5);

    System.out.println(unsortedMap);

    ArrayList<String> unsortedMapKeySet = new ArrayList<>(unsortedMap.keySet());
    Collections.sort(unsortedMapKeySet);
    for(Map.Entry <String, Integer> entry: unsortedMap.entrySet()){
      System.out.print(unsortedMap.get(entry.getKey())+", ");
    }
    System.out.println(unsortedMapKeySet.toString());
    for (String key :
      unsortedMapKeySet) {
      System.out.println(unsortedMap.get(key));
    }
  }
}
