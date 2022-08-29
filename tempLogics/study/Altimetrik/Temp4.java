package study.Altimetrik;

public class Temp4 {
  public static void main(String[] args) {
    int[] arr = {-2,-2,-2,-2};
    int s = 0;

    for(int i: arr){
      s ^= i;
    }

    System.out.println(s);
    System.out.println(s == 0 ? "YES" : "NO");

  }

  static int maxWater(int[] arr, int n) {
    int leftPointer = 0;
    int rightPointer = n - 1;

    // To store Left max and rightPointer max
    // for two pointers leftPointer and rightPointer
    int l_max = 0;
    int r_max = 0;

    // To store the total amount
    // of rain water trapped
    int result = 0;
    while (leftPointer <= rightPointer) {

      // We need check for minimum of leftPointer
      // and rightPointer max for each element
      if (r_max <= l_max) {

        // Add the difference between
        // current value and rightPointer max at index r
        result += Math.max(0, r_max - arr[rightPointer]);

        // Update rightPointer max
        r_max = Math.max(r_max, arr[rightPointer]);

        // Update rightPointer pointer
        rightPointer--;
      } else {

        // Add the difference between
        // current value and leftPointer max at index l
        result += Math.max(0, l_max - arr[leftPointer]);

        // Update leftPointer max
        l_max = Math.max(l_max, arr[leftPointer]);

        // Update leftPointer pointer
        leftPointer++;
      }
    }
    return result;
  }

}
