package Recursion;

public class Decreasing {

  public void sub(int n) {
    if (n == 1) {
      System.out.println(n+" ");
      return;
    }
    System.out.println(n);
    sub(n - 1);
  }

  public static void main(String[] args) {
    int n = 10;
    Decreasing d1 = new Decreasing();
    d1.sub(n);
  }
}
