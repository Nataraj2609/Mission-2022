package study.prog3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ALIterator {
  public static void main(String[] args) {
    System.out.println(new Date());

    Byte nullReferenceVariable = null;
    System.out.println("Checking instanceof with Byte type variable with null stored");
    if (nullReferenceVariable instanceof Byte) {
      System.out.println("nullReferenceVariable is instance of Byte");
    } else {
      System.out.println("nullReferenceVariable is NOT an instance of Byte");
    }


    ArrayList<String> al = new ArrayList<>();
    al.add("John");
    al.add("Cena");
    al.add("VJ");



    ArrayList<String> al2 = new ArrayList<>();
    al2.add("John");
    al2.add("VJ");

    al.retainAll(al2);
    for (String a :
      al) {
      System.out.println(a);
    }

  }
  public int maxNumberOfBalloons(String text) {
    HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();
    hmap.put('a', 0);
    hmap.put('b', 0);
    hmap.put('n', 0);
    hmap.put('l', 0);
    hmap.put('o', 0);

    for (int i = 0; i < text.length(); i++)
      hmap.computeIfPresent(text.charAt(i), (k, v) -> ++v);

    ArrayList<Integer> al = new ArrayList<>();
    al.add(hmap.get('a'));
    al.add(hmap.get('b'));
    al.add(hmap.get('n'));
    al.add(hmap.get('l') >> 2);
    al.add(hmap.get('o') >> 2);

    return Collections.min(al);
  }

}
