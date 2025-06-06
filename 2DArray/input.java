
import java.util.Scanner;

public class input {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Row,Column: ");
    int row = sc.nextInt(),col=sc.nextInt();
    int arr[][] = new int[row][col];
    System.out.println("Enter the number:");
    int sum = 0;
    //getting value
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        arr[i][j] = sc.nextInt();
        sum+= arr[i][j];
      }
    }
    //printing
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    System.out.print("Sum: "+sum);
  }
}
