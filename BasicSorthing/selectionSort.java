package BasicSorthing;

public class selectionSort {
  public static void selectionSort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
      int maxPose = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[maxPose] > arr[j])
          maxPose = j;
      }
      int temp = arr[maxPose];
      arr[maxPose] = arr[i];
      arr[i] = temp;
    }
    //printing
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 2, 234, 213, 45, 23, 34 };
    selectionSort(arr);
  }
}
