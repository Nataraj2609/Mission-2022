package Interview.FullForce.DataStructure.codingEverything;

// Java Program to check whether given sudoku board is valid or not
import java.util.HashSet;

// A Sudoku can be of size -- > 6*6 9*9
//https://www.geeksforgeeks.org/check-if-given-sudoku-board-configuration-is-valid-or-not/
class GFG {

  // Checks whether there is any duplicate in current row or not.
  public static boolean notInRow(char arr[][], int row) {
    HashSet<Character> st = new HashSet<>();
    for (int i = 0; i < 9; i++) {
      if (st.contains(arr[row][i])) {
        return false;
      }
      if (arr[row][i] != '.') {
        st.add(arr[row][i]);
      }
    }
    return true;
  }

  // Checks whether there is any duplicate in current column or not.
  public static boolean notInCol(char arr[][], int col) {
    HashSet<Character> st = new HashSet<>();
    for (int i = 0; i < 9; i++) {
      if (st.contains(arr[i][col])) {
        return false;
      }
      if (arr[i][col] != '.') {
        st.add(arr[i][col]);
      }
    }
    return true;
  }

  // Checks whether there is any duplicate in current 3x3 box or not.
  public static boolean notInBox(char arr[][], int startRow, int startCol) {
    HashSet<Character> st = new HashSet<>();

    for (int row = 0; row < 3; row++) {
      for (int col = 0; col < 3; col++) {
        char curr = arr[row + startRow][col + startCol];

        // If already encountered before, return false
        if (st.contains(curr)) {
          return false;
        }
        // If it is not an empty cell, insert value at current cell in set
        if (curr != '.') {
          st.add(curr);
        }
      }
    }
    return true;
  }

  // Checks whether current row and current column and current 3x3 box is valid or not
  public static boolean isValid(char arr[][], int row, int col) {
    return notInRow(arr, row) &&
           notInCol(arr, col) &&
           notInBox(arr, row - row % 3, col - col % 3);
  }

  public static boolean isValidConfig(char arr[][], int n) {
    for (int i = 0; i < n; i++)
      for (int j = 0; j < n; j++)
        // If current row or current column or current 3x3 box is not valid, return false
        if (!isValid(arr, i, j))
          return false;

   return true;
  }

  public static void main(String[] args) {
    char[][] board = new char[][]{
      {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
      {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
      {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
      {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
      {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
      {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
      {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
      {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
      {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
    };

    System.out.println((isValidConfig(board, board.length) ? "YES" : "NO"));
  }
}
