package BasicSorthing.PracticeQuestion;

public class descendingSort {
  public static void bubble(int arr[]){
    for (int i = 0; i < arr.length-1; i++) {
      for (int j = 0; j < arr.length-1-i; j++) {
        if (arr[j]<arr[j+1]) {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    for (int i : arr) {
      System.out.print(i+ " ");
    }
  }
  public static void main(String[] args) {
    int arr[] = {3,6,2,1,8,7,4,5,3,1};
    bubble(arr);
  }
}
