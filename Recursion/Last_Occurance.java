package Recursion;

public class Last_Occurance {
  static int lastOccurance(int arr[], int key, int i) {
    if (i == arr.length) {
      return -1;
    }
    int isFound = lastOccurance(arr, key, i + 1);
    if (isFound == -1 && arr[i] == key) {
      return i;
    }
    return isFound;
  }

  public static void main(String[] args) {
    int arr[] = { 1, 3, 4, 2, 4,5,3,56 };
    int n = arr.length - 1;
    System.out.println(lastOccurance(arr, 4, n));
  }
}
