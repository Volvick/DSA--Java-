package Recursion;

public class Tiling {
  static int tileCount(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    // vertical f n subtract 1
    int fnm1 = tileCount(n - 1);
    // horizontal f n subtract 2
    int fnm2 = tileCount(n - 2);
    return fnm1 + fnm2;
  }

  public static void main(String[] args) {
    System.out.println(tileCount(4));
  }
}
