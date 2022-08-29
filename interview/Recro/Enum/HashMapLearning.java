package Interview.Recro.Enum;

import java.util.HashMap;

public class HashMapLearning {
  public static void main(String[] args) {
    HashMap<String, String> hmap = new HashMap<>();
    hmap.put("Hokage 7", "Naruto");
    System.out.println(hmap);

    hmap.putIfAbsent("Hokage 4", "Minato");
    System.out.println(hmap);


    hmap.merge("Hokage 7", "Uzumaki", (s, s2) -> s.concat(" Uzumaki").concat(s2));
    System.out.println(hmap);
  }
}
