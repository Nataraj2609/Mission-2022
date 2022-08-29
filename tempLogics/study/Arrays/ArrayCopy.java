package study.Arrays;

public class ArrayCopy {
  public static void main(String[] args) {
    int[] arr = new int[4];
    arr[0] = 2;
    arr[1] = 3;
    arr[2] = 5;
    arr[3] = 87;
    int[] b = {55, 66, 77};
    int[] res = new int[arr.length + b.length];

    System.arraycopy(arr,0, res, 0, arr.length);
    System.arraycopy(b,0, res, arr.length, b.length);

    for (int i :
      res) {
      System.out.println(i);
    }

  }
}
