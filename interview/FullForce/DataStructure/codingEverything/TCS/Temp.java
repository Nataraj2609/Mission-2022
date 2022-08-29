package Interview.FullForce.DataStructure.codingEverything.TCS;

import java.util.ArrayList;
import java.util.Iterator;

public class Temp {
  public static void main(String[] args) {
//    int[][] arr = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
//    int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//    printMatrix(arr);
//    System.out.println("Transposed Matrix");
//    transpose(arr);
//    printMatrix(arr);
//    System.out.println("Reversesd Matrix");
//    arr = reverseMatrix(arr);
//    printMatrix(arr);


    ArrayList<Character> al = new ArrayList<>();
    al.add('a');
    al.add('b');
    al.add('c');
    al.add('d');
    al.add('e');
    al.add('f');

    Iterator<Character> i = al.iterator();
    Iterator<Character> j = al.iterator();

    while(i.hasNext()) {
      while (j.hasNext()) {
        System.out.println(i.next());
        System.out.println(i.next());
      }
    }

  }

  private static int[][] reverseMatrix(int[][] arr) {
    for (int start = 0; start < arr.length; start++) {
      for (int end = 0; end < arr[0].length / 2; end++) {
        int temp = arr[start][end];
        arr[start][end] = arr[start][arr[0].length - end - 1];
        arr[start][arr[0].length - end - 1] = temp;
      }
    }
    return arr;
  }

  private static void transpose(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i+1; j < arr.length; j++) {
        int temp = arr[j][i];
        arr[j][i] = arr[i][j];
        arr[i][j] = temp;
      }
    }
  }

  private static void printMatrix(int[][] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.format("%2d ", arr[i][j]);
      }
      System.out.println();
    }
  }


}
