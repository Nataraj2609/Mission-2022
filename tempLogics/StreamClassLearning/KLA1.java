package StreamClassLearning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KLA1 {
  public static void main(String[] args) {
    List<Integer> arrList = new ArrayList<>();
    arrList.add(1);
    arrList.add(2);
    arrList.add(3);
    arrList.add(4);
    arrList.add(5);

    int n = arrList.size();
    int m = 3;

    int result = findMaximum(arrList, n, m);

    System.out.print(result);

  }

  private static int findMaximum(List<Integer> arrList, int n, int m) {
    Collections.sort(arrList);
    int s = 0;
    int e = arrList.get(n - 1) - arrList.get(0);
    int ans = 0;

    while (s <= e) {
      int mid = (s + e) / 2;

      if (can_place(arrList, n, m, mid)) {
        ans = mid;
        s = mid + 1;
      } else {
        e = mid - 1;
      }
    }
    return ans;
  }

  static boolean can_place(List<Integer> arrList, int n, int B, int mid) {
    int count = 1;
    int last_position = arrList.get(0);

    for (int i = 1; i < n; i++) {
      if (arrList.get(i) - last_position >= mid) {
        last_position = arrList.get(i);
        count++;
        if (count == B) {
          return true;
        }
      }
    }
    return false;
  }
}
