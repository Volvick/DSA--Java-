package Recursion;

public class SumOfN {
  static int nSum(int n) {
    if (n != 0)
      return n + nSum(n - 1);
    else
      return 0;
  }

  public static void main(String[] args) {
    int n = 10;
    System.out.println(nSum(n));
  }
}
