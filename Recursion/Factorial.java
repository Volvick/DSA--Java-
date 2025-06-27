package Recursion;



public class Factorial {
  static int fact = 1;
  public static void Factorial(int n) {
      if (n==1) {
        System.out.println(n);
        return;
      }
      Factorial(n-1);
      fact = n*fact;
      System.out.println(fact);
  }


  public static void main(String[] args) {
    int n = 5;
    Factorial(n);
  }
}
