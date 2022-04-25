
import java.util.Arrays;

/**
 * Quick Sort
 *
 *
 * Time Complexity : O(n^2) - Worst case scenario & O(nlogn) - best case
 * Space Complexity: O(n)   - Worst case scenario & O(logn) - best case , Quick Sort requires less space
 *
 * 1. Select Last element as Pivot
 * 2. Arrange Pivot in the sense : Left < <---> Pivot <---> > Right
 * 3. Partitioning : Two Pointer Variables -> i - loop variable and b - boundary to mark the partition b/w left & right partitions (end of the left partitions, initially -1)
 * 4. traverse using i, compare it with Pivot, if smaller, increment boundary & Swap with boundary element
 * 5. Repeat 4 till you reach Pivot & swap ++boundary with Pivot. This is called Partitioning & do it for rest of the arrays.
 *
 *
 * Things to remember
 *  a. Recursion - Base condition to end
 *  b. This algo needs start, end parameters in its function call
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {3, 33, 55, 6, 7, 89, 0};
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //Helper function
    private static void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int start, int end) {
        //Base Condition
        //Partitioning
        //Sort(Left)
        //Sort(Right)

        //Base condition
        if(start >= end)
            return;

        //Partitioning
        int pivot = arr[end];
        int boundary = start - 1;
        for (int i = start; i <= end; i++) {
            if (arr[i] <= pivot)
                swap(arr, i, ++boundary);
        }

        quickSort(arr, start, boundary - 1);
        quickSort(arr, boundary + 1, end);
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
