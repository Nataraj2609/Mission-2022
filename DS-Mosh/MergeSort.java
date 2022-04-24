
import java.util.Arrays;

/***
 * Merge Sort
 *
 * Time Complexity - O(nlogn)
 *
 *         1.Base condition for Recursion to end
 *         2.Divide the array into two halves
 *         3.Sort the two halves individually
 *         4.Merge them back to form resultSet
 */

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {3, 33, 55, 6, 7, 89, 0};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeSort(int[] arr) {
        // Recursion Base Condition to terminate
        if (arr.length < 2)
            return;

        //Divide into two halves
        int middle = arr.length / 2;

        int[] left = new int[middle];
        for (int i = 0; i < middle; i++) {
            left[i] = arr[i];
        }

        int[] right = new int[arr.length - middle];
        for (int j = middle; j < arr.length; j++) {
            right[j - middle] = arr[j];
        }

        //Sort
        mergeSort(left);
        mergeSort(right);

        //Merge
        merge(left, right, arr);
    }

    private static void merge(int[] left, int[] right, int[] result) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j])
                result[k++] = left[i++];
            else
                result[k++] = right[j++];
        }

        while (i < left.length)
            result[k++] = left[i++];

        while (j < right.length)
            result[k++] = right[j++];
    }
}
