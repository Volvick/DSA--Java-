package June;

public class subArray {
  public static void subArray(int arr[]){
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        for (int j2 = j; j2 < arr.length; j2++) {
          System.out.print(arr[j2]+" ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int arr[] = { 2, 4, 6, 8, 10 };
    subArray(arr);
  }
}
