package Recursion.Practice;

public class NumToEnglish {
 static String arr[] = { "zero", "one", "two", "three", "four", "five", "six", "Seven", "eight", "nine" };
  static void numToEnglish(int n) {
    if (n == 0) {
      return;
    }
    int lastDigit = n %10;
    numToEnglish(n/10);
    System.out.print(arr[lastDigit] + " ");
  }

  public static void main(String[] args) {
    numToEnglish(184);
  }
}
