package fileReading.FreshWorks.Educative.BitwiseXOR;

public class TempXoR {
  public static void main(String[] args) {
    int[] arr = new int[] { 1, 4, 2, 1, 3, 5, 6, 2, 3, 5 };
    int[] result = findSingleNumbers(arr);
    System.out.println("Single numbers are: " + result[0] + ", " + result[1]);
  }

  private static int[] findSingleNumbers(int[] nums) {
    int n1xn2 = 0;
    for(int i : nums){
      n1xn2 = n1xn2^i;
    }

    int righMostBit = 1;
    while(((n1xn2 & righMostBit) == 0)){
      righMostBit = righMostBit << 1;
    }

    int n1=0, n2=0;
    for(int x: nums){
      if((x & righMostBit) != 0)
        n1 ^= x;
      else
        n2 ^= x;
    }

    return new int[]{n1, n2};
  }
}
