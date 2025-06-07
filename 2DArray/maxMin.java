import java.util.Scanner;

public class maxMin {
  public static void maxMin(int arr[][]){
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if (arr[i][j]>max)
          max = arr[i][j];
        if (arr[i][j]<min)
          min = arr[i][j];
      }
    }
    System.out.println("Max:"+max);
    System.out.println("Min:"+min);
  }
  public static void main(String[] args) {
    int arr[][] = new int[3][3];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter values: ");
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    maxMin(arr);

  }
}
