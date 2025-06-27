package Recursion;

public class Incresing{
  public void sub(int n) {
    if (n == 1) {
      System.out.println(n+" ");
      return;
    }

    sub((n-1));
    System.out.println(n+" ");
  }

  public static void main(String[] args) {
    int n = 10;
    Incresing d1 = new Incresing();
    d1.sub(n);
  }
}
