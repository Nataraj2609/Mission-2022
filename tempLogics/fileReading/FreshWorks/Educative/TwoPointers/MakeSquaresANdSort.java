package fileReading.FreshWorks.Educative.TwoPointers;

public class MakeSquaresANdSort {

  public static void main(String[] args) {
    int[] result = makeSquares(new int[]{-2, -1, 0, 2, 3});
    for (int num : result) {
      System.out.print(num + " ");
    }
    System.out.println();

    result = makeSquares(new int[]{-3, -1, 0, 1, 2});
    for (int num : result) {
      System.out.print(num + " ");
    }
    System.out.println();
  }

  private static int[] makeSquares(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    int[] res = new int[arr.length];
    int resPtr = right;

    while (left < right) {
      int leftElem = arr[left] * arr[left];
      int righElem = arr[right] * arr[right];

      if(leftElem > righElem){
        res[resPtr--] = leftElem;
        left++;
      } else{
        res[resPtr--] = righElem;
        right--;
      }
    }
    return res;
  }
}
