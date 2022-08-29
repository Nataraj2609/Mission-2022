package Interview.FullForce.search;

public class LinearSearch {
  public static void main(String[] args) {
    int[] arr = {2, 3, 54, 7, 8, 9, 0, 32, 3254};
    int searchFor = 9;

    for (int i =0 ; i < arr.length ; i++) {
      if (arr[i] == searchFor) {
        System.out.println("Found at " + (i+1)+ " th position");
      }
    }
  } // Time Complexity : O(n)  // Space Complexity : O(1)
}
