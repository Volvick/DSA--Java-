
package Recursion.Practice;

public class FirstLastOcc {
  static int firstocc = -1;
  static int lastocc = -1;

  static void occurance(String str, int indx, char ch) {
    if (indx == str.length()) {
      System.out.println(firstocc);
      System.out.println(lastocc);
      return;
    }
    if (str.charAt(indx) == ch) {
      if (firstocc == -1) {
        firstocc = indx;
      } else {
        lastocc = indx;
      }
    }
    occurance(str, indx + 1, ch);
    
  }

  public static void main(String[] args) {
    String str = "abaacdaefaah";
    occurance(str, 0, 'a');
  }
}
