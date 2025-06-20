package Bitwise_Operator.Practice;

public class swap {
  public static void main(String[] args) {
    int x = 10, y = 40;
    x = x ^ y;
    y = x ^ y;
    x = x ^ y;
    System.out.println("X: "+x+" Y: "+y);
  }
}
