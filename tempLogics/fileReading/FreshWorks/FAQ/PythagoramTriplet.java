package fileReading.FreshWorks.FAQ;

import java.util.Arrays;

// https://www.educative.io/answers/how-to-find-pythagorean-triplets-in-an-array
public class PythagoramTriplet {
  public static void main(String[] args) {
    int arr[] = {3, 7, 5, 9, 4};
    findTriplet(arr, arr.length);
  }

  static void findTriplet(int arr[], int n) {
    // Step1
    for (int i = 0; i < n; i++) {
      arr[i] = arr[i] * arr[i];
    }
    Arrays.sort(arr);

    // Step2 and Step 3
    for (int i = n - 1; i >= 2; i--) {  // Fix a
      int b = 0; // Fix b
      int c = i - 1; // Fix c
      while (b < c) {
        // A triplet found
        if (arr[b] + arr[c] == arr[i]) {
          System.out.printf("Triplets: %d, %d, %d\n", new Object[]{(int)Math.sqrt(arr[b]),(int) Math.sqrt(arr[c]),(int) Math.sqrt(arr[i])});
          b++;
          c--;
        }
        if (arr[b] + arr[c] < arr[i])
          b++;
        else
          c--;
      }
    }


  }
}

/**
 * The steps involved would be:
 *
 * Square every element in the input array and then sort it in ascending order.
 * Since the array now contains squares, the new equation for triplet becomes a = b + c
 * a=b+c
 * . Fix a to be the last element of this sorted array, since a will always have the largest value of the three numbers.
 * Fix b as the first element of the sorted array and c as the element right before element a. Since numbers are positive and the array is sorted, b < a
 * b<a
 *  and c < a
 * c<a
 * . To find triplets, run a loop that increases b from 1
 * 1
 *  to n
 * n
 * , and decreases c from n
 * n
 *  to 1
 * 1
 *  at the same time until they meet.
 * Increase the position of b if b + c < a
 * b+c<a
 * .
 * Decrease the position of c if b + c > a
 * b+c>a
 *  .
 * If the sum is equal to a, then print the square root of the three numbers, increment b, and decrement c.
 * Repeat the last step for each element a in the array.
 */
