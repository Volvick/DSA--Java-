package June;

public class spiralMatrix {
  public static void printMatrix(int matrix[][]){
    int startRow=0;
    int startCol=0;
    int endCol = matrix[0].length-1;
    int endRow = matrix[0].length-1;
    while (startRow<=endRow&&startCol<=endCol) {
      //top
      for (int i = startRow; i <= endRow; i++) {
        System.out.print(matrix[startRow][i]+" ");
      }
      //right
      for (int i = startCol+1; i <= endRow; i++) {
        System.out.print(matrix[i][endCol]+" ");
      }
      //bottom
      for (int i = endRow-1; i >=startCol; i--) {
        if (startRow==endRow) {
          break;
        }
        System.out.print(matrix[endRow][i]+" ");
      }
      //left
      for (int i = endCol-1; i >=startRow+1; i--) {
        if (startCol==endCol) {
          break;
        }
        System.out.print(matrix[i][startCol]+" ");
      }
      startRow++;
      startCol++;
      endRow--;
      endCol--;
    }
  }
   public static void main(String[] args) {
    int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
    printMatrix(matrix);
   }
}
