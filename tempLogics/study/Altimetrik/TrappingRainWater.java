package study.Altimetrik;

public class TrappingRainWater {
  static int maxWater(int[] arr, int n) {
    int leftPointer = 0;
    int rightPointer = n - 1;

    int l_max = 0;
    int r_max = 0;

    int result = 0;
    while (leftPointer <= rightPointer) {

      if (r_max <= l_max) {
        result += Math.max(0, r_max - arr[rightPointer]);
        r_max = Math.max(r_max, arr[rightPointer]);
        rightPointer--;
      } else {
        result += Math.max(0, l_max - arr[leftPointer]);
        l_max = Math.max(l_max, arr[leftPointer]);
        leftPointer++;
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] arr = {3, 0, 2, 0, 4};
    int N = arr.length;
    System.out.print(maxWater(arr, N));
  }
}


