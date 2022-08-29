package study.morgnStanley;

import java.util.PriorityQueue;
import java.util.Scanner;

public class HackerRank2 {
  public static void main(String[] args) {
    int t;
    Scanner scan = new Scanner(System.in);
    t = scan.nextInt();

    while (t-- != 0) {
      int n;
       n = scan.nextInt();;
      if (n == 1) {
        System.out.print("1\n");
        continue;
      }
      //     ll x=floor((-3.0+sqrt(9.0+8.0*double(n)))/2.0);
      double x =Math.floor((-3.0 + Math.sqrt(9.0 + 8.0 * (double) n))/2.0);
      System.out.println(2 * (n - x) );
    }

  }
}
