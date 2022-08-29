package Interview.FullForce.DataStructure.codingEverything.TCS;

import java.util.ArrayList;

public class MyProgram {
  public static void main(String[] args) {
    ArrayList<Character> al = new ArrayList<>();
    al.add('a');
    al.add('a');
    al.add('b');
    al.add('c');
    al.add('d');
    al.add('e');

    for (int i = 0; i < al.size(); i++) {
      System.out.println(al.get(i));
      Character obj = new Character('a');
      al.remove(obj);
    }
  }
}
