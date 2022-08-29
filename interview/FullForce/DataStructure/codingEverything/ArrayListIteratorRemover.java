package Interview.FullForce.DataStructure.codingEverything;

import java.util.ArrayList;

/**
 * In this coding question, you are asked to implement the function separate(ArrayList<Integer> myList) that takes an ArrayList of integers as a parameter and returns the same as well.
 * <p>
 * Your task is to separate the even numbers from the odd numbers. Place all the even numbers to the left side of the ArrayList and place all the odd numbers to the right side of the ArrayList.
 * <p>
 * Note: You are not allowed to create extra ArrayList variables. All the operations and changes need to be performed on the same myList variable that is passed as the parameter.
 */
public class ArrayListIteratorRemover {
  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(3);
    al.add(30);
    al.add(44);
    al.add(449);
    separate(al);
    for (int a : al) {
      System.out.println(a);
    }
  }

  private static void separate(ArrayList<Integer> al) {
    int even = 0, odd = al.size() - 1;
    for (int i = 0; i < al.size(); i++) {
      if (al.get(i) % 2 == 0) {
        al.add(even++, al.get(i));
      } else {
        al.add(odd--, al.get(i));
      }
    }
  }
}
