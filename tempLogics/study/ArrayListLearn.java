package study;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayListLearn {
  public static void main(String[] args) {
    List<Map<String, Object>> radplusTransferQueueEntityList = new ArrayList<>();
    Map<String, Object> map1 = new HashMap<>();
    map1.put("id", 123);
    radplusTransferQueueEntityList.add(map1);
    Map<String, Object> map2 = new HashMap<>();
    map2.put("id", 67527);
    radplusTransferQueueEntityList.add(map2);


    List<String> idList = new ArrayList<>();
    for (Map<String, Object> m : radplusTransferQueueEntityList) {
      idList.add(m.get("id").toString());
    }
    System.out.println(idList.toString());

    List<String> id2 = radplusTransferQueueEntityList.stream().map(m -> m.get("id").toString()).collect(Collectors.toList());
    System.out.println(id2);


  }
}
