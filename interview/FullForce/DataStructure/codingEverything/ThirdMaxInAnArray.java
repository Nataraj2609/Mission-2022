package Interview.FullForce.DataStructure.codingEverything;

public class ThirdMaxInAnArray {
  public static void main(String[] args) {
    int[] arr = {55, 6, 7, 8, 22, 3};
    System.out.println(findThirdMax(arr));
  }

  private static int findThirdMax(int[] arr) {
    int max1 = 0, max2 = 0, max3 = 0;
    for (int x : arr) {
      if (x > max1) {
        max3 = max2;
        max2 = max1;
        max1 = x;
      } else if (x > max2) {
        max3 = max2;
        max2 = x;
      } else if (x > max3) {
        max3 = x;
      }
    }
    return max3;
  }
}
