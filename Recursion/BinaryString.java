package Recursion;

public class BinaryString {
  static void printString(int n, String str, int lastplace) {
    if (n == 0) {
      System.out.println(str);
      return;
    }
    printString(n - 1, str + "0", 0);
    if (lastplace == 0) {
      printString(n - 1, str + "1", 1);
    }
  }

  public static void main(String[] args) {
    printString(3, "", 0);
  }

}
