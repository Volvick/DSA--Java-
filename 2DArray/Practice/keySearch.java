package Practice;

public class keySearch {
  public static void key(int arr[][], int key) {
    int n = arr.length;
    int m = arr[0].length;
    int low = 0, high = n * m - 1;

    while (low <= high) {
      int mid = (low + high) / 2;
      int row = mid / m;
      int col = mid % m;

      if (arr[row][col] == key) {
        System.out.println("Found at: (" + row + "," + col + ")");
        return;
      } else if (arr[row][col] > key) {
        high = mid - 1;
      } else {
        low = mid + 1;
      }
    }

    System.out.println("Not found");
  }

  public static void main(String[] args) {
    int arr[][] = {
        { 1, 3, 5, 7 },
        { 10, 11, 16, 20 },
        { 23, 30, 34, 60 }
    };
    int key = 30;
    key(arr, key);
  }
}
