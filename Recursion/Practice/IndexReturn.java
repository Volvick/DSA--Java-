package Recursion.Practice;

public class IndexReturn {
  static void returnIndexOfKey(int i, int arr[], int key) {
    if (i == arr.length) {
      return;
    }
    if (arr[i] == key) {
      System.out.println(i);
    }
    returnIndexOfKey(i + 1, arr, key);
  }

  public static void main(String[] args) {
    int arr[] = {3,4,4,3,4,2,4,3,4};
    returnIndexOfKey(0, arr, 3);
  }
}
