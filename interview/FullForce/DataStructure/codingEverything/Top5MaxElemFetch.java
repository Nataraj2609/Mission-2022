package Interview.FullForce.DataStructure.codingEverything;

public class Top5MaxElemFetch {
  public static void main(String[] args) {
    int[] arr = {200, 3, 4, 5, 60, 7, 8_9, 9, 10, 11, 44};
    printTop5(arr);
  }

  private static void printTop5(int[] arr) {
    int[] copy = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      copy[i] = arr[i];
    }
    int[] top5 = new int[5];

    for (int i = 0; i < 5; i++) {
      int max = 0;
      int max_index = -1;
      for (int j = 0; j < copy.length; j++) {
        if(copy[j] > max){
          max = copy[j];
          max_index = j;
        }
      }
      top5[i] = max;
      copy[max_index] = Integer.MIN_VALUE;
    }

    for (int k : top5) {
      System.out.println(k);
    }

  }
}
