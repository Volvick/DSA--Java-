package Recursion;

public class OptimizedPower {
  static int optimizedPower(int a, int n) {
    if (n == 0) {
      return 1;
    }
    int halfPower = optimizedPower(a, n / 2);
    int halfPowerSquare = halfPower * halfPower;
    if (n % 2 != 0) {
      return a * halfPowerSquare;
    }
    return halfPowerSquare;
  }
  public static void main(String[] args) {
    System.out.println(optimizedPower(2, 10));
  }
}
