package Recursion;

public class LastOcc {
  static int lastOcc(int arr[], int key, int i) {
    if (i == arr.length) {
      return -1;
    }
    int isFound = lastOcc(arr, key, i + 1);
    if (isFound == -1 && arr[i] == key) {
      return i;
    }
    return isFound;
  }

  public static void main(String[] args) {
    int arr[] = { 2, 3, 4, 54, 3, 5, 4,85 };
    System.out.println(lastOcc(arr, 4, 0));

  }
}
