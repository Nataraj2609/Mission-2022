package Interview.FullForce.JavaConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class streamDoubtClarification {
  public static void main(String[] args) {
    Map<String, String> h1 = new HashMap<>();
    h1.put("id", "AWS");
    Map<String, String> h2 = new HashMap<>();
    h2.put("id", "Java");

    List<Map<String, String>> interfaceDistDetailEntities = new ArrayList<>();
    interfaceDistDetailEntities.add(h1);
    interfaceDistDetailEntities.add(h2);

    List<String> idList =
    interfaceDistDetailEntities.stream().map(m -> m.get("id").toString()).collect(Collectors.toList());

    List<String> idList2 = new ArrayList<>();
    for (Map<String, String> m : interfaceDistDetailEntities) {
      idList2.add(m.get("id").toString());
    }
    idList2.forEach(System.out::println);
idList.forEach(System.out::println);
  }
}
