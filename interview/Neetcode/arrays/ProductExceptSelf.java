package Interview.Neetcode.arrays;

public class ProductExceptSelf {
  public static void main(String[] args) {
    int arr[] = {4, 2, 3, 6, 2};
    for (int i : arr) {
      System.out.print(i + " ,");
    }
    System.out.println();
    int res[] = productExceptSelf(arr);
    for (int i : res) {
      System.out.print(i + " ,");
    }
  }

  private static int[] productExceptSelf(int[] arr) {
    int n = arr.length;
    int[] res = new int[n];

    int prefix = 1;
    for (int i = 0; i < n; i++) {
      res[i] = prefix;
      prefix *= arr[i];
    }

    int postfix = 1;
    for (int j = n - 1; j >= 0; j--) {
      res[j] *= postfix;
      postfix *= arr[j];
    }

    return res;
  }
}
