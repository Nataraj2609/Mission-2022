package Interview.FullForce.DataStructure.codingEverything.EducativeJava1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Temp {
  public static void main(String[] args) {
    HashMap<Integer, String> hmap = new HashMap<>();
    hmap.put(1, "Nataraj");
    hmap.put(2, "Amreetha");
    hmap.put(3, "Manjula");

    Map result = hmap.entrySet().stream()
      .sorted(Map.Entry.comparingByValue())
      .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

    result.entrySet().stream().forEach(System.out::println);
    System.out.println(result instanceof List);
  }
}

