package important_stuffs.RecallDS.NullCheck;

public class MainClass {
  public static void main(String[] args) {
    int n = 6;
    int j = 1;

    for (int i = 0; i < n; i++) {
      int space = n - j;
      for (int k = 1; k <= space; k++) {
        System.out.print(" ");
      }
      for (int l = 1; l <= j; l++) {
        System.out.print("#");
      }
      j++;
      System.out.println();
    }
  }

}

