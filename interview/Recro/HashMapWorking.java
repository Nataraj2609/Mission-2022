package Interview.Recro;

import java.util.HashMap;

public class HashMapWorking {
  public static void main(String[] args) {
    HashMap<Integer, String> hmap = new HashMap();
    hmap.put(33, "Nat");
    System.out.println(hmap.get(33));
    hmap.remove(33);

    System.out.println(hmap.containsKey(33));

  }
}
