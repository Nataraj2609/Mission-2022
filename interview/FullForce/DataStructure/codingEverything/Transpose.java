package Interview.FullForce.DataStructure.codingEverything;

public class Transpose {
  public static void main(String[] args) {
    int[][] matrix = {{1, 2, 3},
      {4, 5, 6}};
    transpose(matrix);
    int rows = matrix.length;
    int columns = matrix[0].length;

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  private static void transpose(int[][] matrix) {

    int rows = matrix.length;
    int columns = matrix[0].length;
    int[][] trans = new int[columns][rows];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        trans[j][i] = matrix[i][j];
      }
    }

  }
}
