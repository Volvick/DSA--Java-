package May;

public class subArray {
  public static void subArray(int arr[]){
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        for (int j2 = i; j2 <=j; j2++) {
          System.out.print(arr[j2]+" ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
  public static void main(String[] args) {
    int arr[] = {2,4,5,3,9,8,7};
    subArray(arr);
  }
}
