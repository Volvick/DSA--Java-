package BasicSorthing;

public class insertionSort {
  public static void insertionSort(int arr[]) {
    for (int i = 1; i < arr.length ; i++) {
      int curr = arr[i];// current element
      int prev = i - 1;// previous element
      // finding out the correct position to insert
      while (prev >= 0 && arr[prev] > curr) {
        arr[prev + 1] = arr[prev];
        prev--;
      }
      // insertion
      arr[prev + 1] = curr;
    }
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 5, 4, 1, 3, 2 };//55 prev neg
    insertionSort(arr);
  }
}
