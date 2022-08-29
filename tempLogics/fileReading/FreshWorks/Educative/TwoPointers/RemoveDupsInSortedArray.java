package fileReading.FreshWorks.Educative.TwoPointers;

public class RemoveDupsInSortedArray {
  public static void main(String[] args) {
    int[] arr = {2, 3, 3, 3, 6, 9, 9};
    int[] res = (removeDups(arr));
    for (int x :
      res) {
      System.out.println(x);
    }
  }

  private static int[] removeDups(int[] arr) {
    int realPtr = 0;

    for(int i = 1; i < arr.length; i++ ){
      if(arr[realPtr] != arr[i]){
        arr[++realPtr] = arr[i] ;
      }
      else continue;
    }
    return arr;

  }
}
