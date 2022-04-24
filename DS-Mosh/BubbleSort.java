
import java.util.Arrays;

/***
 * Bubble Sort
 *
 * Compare one bubble with previous and swap accordingly for all the elements starting with index 1
 *
 * Compare
 * Swap 
 * 
 * Time Complexity: O(n^2)
 * Mosh Course
 * */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 33, 55, 6, 7, 89, 0};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr) {

        int len = arr.length;
        for (int i = 0; i < len; i++)
            for (int j = 1; j < len - i; j++)
                // If current element is smaller than previous, swap
                if (arr[j] < arr[j - 1])
                    swap(arr, j, j - 1);
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
