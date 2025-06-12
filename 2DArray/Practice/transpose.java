package Practice;

public class transpose {
  public static void transpose(int arr[][]){
    int newArr[][] = new int[arr[0].length][arr.length];
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        newArr[j][i] = arr[i][j];
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    System.out.println("----------------------");
    for (int i = 0; i < newArr.length; i++) {
      for (int j = 0; j < newArr[0].length; j++) {
        System.out.print(newArr[i][j]+" ");
      }
      System.out.println();
    }

  }
  public static void main(String[] args) {
    int arr[][] = {
      {11,12,13},
      {21,22,23}
    };
    transpose(arr);
  }
}
