package June;

public class diagonalArrSum {
  public static void diagonalArrSum(int matrix[][]) {
    int sum = 0;
    int n = matrix.length;
    for (int i = 0; i < n; i++) {
      sum += matrix[i][i]; // primary diagonal
      if (i != n - i - 1) {
        sum += matrix[i][n - i - 1]; // secondary diagonal
      }
    }
    System.out.println("Sum: " + sum);
  }

  public static void main(String[] args) {
    int matrix[][] = {
      { 1, 2, 3, 4 },
      { 5, 6, 7, 8 },
      { 9, 10, 11, 12 },
      { 13, 14, 15, 16 }
    };
    diagonalArrSum(matrix);
  }
}
