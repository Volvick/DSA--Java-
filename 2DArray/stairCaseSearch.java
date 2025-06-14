public class stairCaseSearch {
  public static boolean stairCaseSearch(int arr[][], int key) {
    int row = 0, col = arr[0].length - 1;
    while (row < arr.length && col >= 0) {
      if (arr[row][col] == key) {
        System.out.println("Key found at: (" + row + "," + col + ")");
        return true;
      } else if (key > arr[row][col]) {
        row++;
      } else {
        col--;
      }
    }
    System.out.println("Key not found");
    return false;
  }

  public static void main(String[] args) {
    int arr[][] = {
        { 10, 20, 30, 40 },
        { 15, 25, 35, 45 },
        { 27, 29, 37, 48 },
        { 32, 33, 39, 50 } };
    int key = 33;
    stairCaseSearch(arr, key);
  }
}
