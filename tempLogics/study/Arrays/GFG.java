package study.Arrays;

class GFG {

  // Recursive function that returns square root of a number with precision upto 5 decimal places
  static double Square(double n, double i, double j) {
    double mid = i + (j - i) / 2;
    double mul = mid * mid;

    // If mid itself is the square root, return mid
    if ((mul == n) || (Math.abs(mul - n) < 0.00001)) {
      return mid;
    }

    // If mul is less than n, recur second half
    else if (mul < n) {
      return Square(n, mid, j);
    }

    // Else recur first half
    else {
      return Square(n, i, mid);
    }
  }

  static void findSqrt(double n) {
    double i = 1;
    boolean found = false;
    while (!found) {

      if (i * i == n) {
        System.out.println(i);
        found = true;
      } else if (i * i > n) {
        // Square root will lie in the interval i-1 and i
        double res = Square(n, i - 1, i);
        System.out.printf("%.5f", res);
        found = true;
      }
      i++;
    }
  }

  public static void main(String[] args) {
    double n = 3;
    findSqrt(n);
  }
}

