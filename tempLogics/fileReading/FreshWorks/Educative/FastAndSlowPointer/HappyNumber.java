package fileReading.FreshWorks.Educative.FastAndSlowPointer;

public class HappyNumber {
  public static void main(String[] args) {
    int n = 89;

    int fast = n;
    int slow = n;
    do{
      fast = findSumOfSquareOfDigits(findSumOfSquareOfDigits(fast));
      slow = findSumOfSquareOfDigits(slow);
    } while( fast != slow);
    System.out.println(slow == 1);
  }

  private static int findSumOfSquareOfDigits(int n) {
    int sum = 0, digit = 0;

    while (n != 0) {
      digit = n % 10;
      sum += digit * digit;
      n = n / 10;
    }

    return sum;
  }
}
