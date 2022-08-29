package StreamClassLearning;

import java.util.List;

public class athena1 {
    public static void main(String[] arr) {

    }

    public static int min_cost(List<List<Integer>> cost) {
        int len, min_cost;
        Integer[][] array = new Integer[cost.size()][];
        Integer[] array1 = new Integer[0];
        for (int i = 0; i < cost.size(); i++)
            array[i] = cost.get(i).toArray(array1);
        for (int i = 1; i < array.length; i++) {
            array[i][0] += Math.min(array[i - 1][1], array[i - 1][2]);
            array[i][1] += Math.min(array[i - 1][0], array[i - 1][2]);
            array[i][2] += Math.min(array[i - 1][0], array[i - 1][1]);
        }
        len = array.length;
        min_cost = Math.min(array[len - 1][0],
                Math.min(array[len - 1][1], array[len - 1][2]));
        return min_cost;
    }
}
