package Practice;

public class count {
  public static int count(int arr[][],int key){
    int counter=0;
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        if (key==arr[i][j]) {
          counter++;
        }
      }
    }
    return counter;
  }
  public static void main(String[] args) {
    int[][] array = { {4,7,8},{8,8,7} };
    int key = 7;
    System.out.println(count(array, key));
  }
}
