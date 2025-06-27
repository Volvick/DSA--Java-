package Recursion;

public class NewFactorial {
  static int factorial(int n) {
    if (n != 0)
      return n * factorial(n - 1);
    else
      return 1;
  }
  public static void main(String[] args) {
    int n = 10;
    System.out.println(factorial(n));
  }
}
