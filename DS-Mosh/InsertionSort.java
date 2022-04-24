import java.util.Arrays;

/***
 *Insertion Sort
 *
 *Sorted Array <---> Unsorted array
 *
 *Compare CURRENT element at unsorted array with previous positions at sorted array and COPY till perfect place is found accordingly for all the elements starting with index 1
 * Time Complexity: O(n^2)
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 33, 55, 6, 7, 89, 0};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr) {

        int len = arr.length;

        for (int i = 1; i < len; i++) {
            int current = arr[i];

            // If current element is smaller than previous, COPY until you get a position with bigger one
            // Sorted Array <---> Unsorted Array
            int j = i - 1;

            //Compare it with Previous ones,so j-- to traverse left
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }
}
