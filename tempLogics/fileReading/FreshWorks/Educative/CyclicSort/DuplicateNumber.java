package fileReading.FreshWorks.Educative.CyclicSort;

public class DuplicateNumber {

  private static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
    System.out.println(findNumber(new int[]{2, 1, 3, 3, 5, 4}));
    System.out.println(findNumber(new int[]{2, 4, 1, 4, 4}));

    try{
      throw new StringIndexOutOfBoundsException();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private static int findNumber(int[] nums) {
    int i = 0;
    while (i < nums.length) {
      if (nums[i] != nums[nums[i] - 1]) {
        swap(nums, i, nums[i] - 1);
      } else {
        i++;
      }
    }

    for (i = 0; i < nums.length; i++) {
      if (nums[i] != i + 1)
        return nums[i];
    }

    return -1;
  }
}
