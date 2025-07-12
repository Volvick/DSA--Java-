package Recursion.Practice;

public class NumToEnglish {
  static void numToEnglish(String str, int i) {
    if (i == str.length()) {
      return;
    }
    String arr[] = { "zero", "one", "two", "three", "four", "five", "six", "Seven", "eight", "nine" };
    int charAt = str.charAt(i) - 48;// ascii value of 0 = 48
    System.out.print(arr[charAt] + " ");
    numToEnglish(str, i + 1);
  }

  public static void main(String[] args) {
    numToEnglish("184", 0);
  }
}
