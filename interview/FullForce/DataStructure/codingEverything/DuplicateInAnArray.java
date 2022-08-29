package Interview.FullForce.DataStructure.codingEverything;

public class DuplicateInAnArray {
  public static void main(String[] args) {
    int[] arr = {2, 3, 4, 5, 6, 2};
    int dups = arr[0];
    for (int i = 1; i < arr.length; i++) {
      dups ^= arr[i];
    }
    System.out.println(dups);
  }
}

//1 2 3 4 5 --> 15
//n(n+1)/2 5*6/2 = 15