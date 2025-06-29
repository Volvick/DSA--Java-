package Recursion;

public class NewFactorial {
  static int factorial(int n) {
    return n != 0 ? n * factorial(n - 1) : 1;
  }

  public static void main(String[] args) {
    System.out.println(factorial(5));
  }
}
