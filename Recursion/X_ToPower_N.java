package Recursion;

public class X_ToPower_N {
  static int powerCalc(int x, int n) {
    if (n == 0) {
      return 1;
    }
    return x * powerCalc(x, n - 1);
  }

  public static void main(String[] args) {
    System.out.println(powerCalc(2, 10));
  }
}
