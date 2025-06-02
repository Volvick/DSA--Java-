package BasicSorthing.PracticeQuestion;

public class selectiondesc {
  public static void selectiondesc(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      int minpos = i;
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[minpos] < arr[j]) {
          minpos = j;
        }
      }
      int temp = arr[minpos];
      arr[minpos] = arr[i];
      arr[i] = temp;
    }
    for (int i : arr) {
      System.out.print(i + " ");
    }
  }

  public static void main(String[] args) {
    int arr[] = { 2, 4, 5, 3, 8 };
    selectiondesc(arr);
  }
}
