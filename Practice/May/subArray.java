package May;

public class subArray {
  // public static void subArray(int arr[]) {
  // for (int i = 0; i < arr.length; i++) {
  // for (int j = i; j < arr.length; j++) {
  // for (int j2 = i; j2 <= j; j2++) {
  // System.out.print(arr[j2] + " ");
  // }
  // System.out.println();
  // }
  // System.out.println();
  // }
  // }
  // public static void pairs(int arr[]){
  // for (int i = 0; i < arr.length; i++) {
  // for (int j = i+1; j < arr.length; j++) {
  // System.out.print("("+arr[i]+" "+arr[j]+"),");
  // }
  // System.out.println();
  // }
  // }
  public static void MaxSubarraySum(int arr[]) {
    int sum = 0;int max = Integer.MIN_VALUE;int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        for (int j2 = i; j2 <= j; j2++) {
          System.out.print(arr[j2] + " ");
          sum += arr[j2];
        }
        if (sum > max) {
          max = sum;
        }else{
          min = sum;
        }
        System.out.print("sum: " + sum);
        sum = 0;
        System.out.println();
      }
      System.out.println();
    }
    System.out.print("max: " + max);
    System.out.print("\nmin: " + min);
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 5, 3, 9, 8, 7 };
    // subArray(arr);
    // pairs(arr);
    MaxSubarraySum(arr);
  }
}
