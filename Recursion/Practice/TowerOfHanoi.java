package Recursion.Practice;

public class TowerOfHanoi {
  static void towerOfHanoi(int n, String src, String helper, String des) {
    if (n == 1) {
      System.out.println("Transfer Disc " + n + " from " + src + " to " + des);
      return;
    }
    towerOfHanoi(n - 1, src, des, helper);
    System.out.println("Transfer Disc " + n + " from " + src + " to " + des);
    towerOfHanoi(n - 1, helper, src, des);
  }

  public static void main(String[] args) {
    towerOfHanoi(3, "S", "H", "D");
  }
}
