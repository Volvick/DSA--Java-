package BasicSorthing;
import java.util.*;
public class inbuit {
  public static void main(String[] args) {
    Integer arr[] = {5,23,2,3,41,32};
    // Arrays.sort(arr);
    // Arrays.sort(arr,0,3);
    // Arrays.sort(arr,Collections.reverseOrder()); //reverse order sorting
    Arrays.sort(arr,0,4,Collections.reverseOrder()); //reverse order sorting

    //print
    for (int i : arr) {
      System.out.print(i+" ");
    }
  }
}
