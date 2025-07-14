package Recursion.Practice;

public class ReverseString {
  static void reverseString(String str,int indx){
    if (indx==0) {
      System.out.println(str.charAt(indx));
      return;
    }
    System.out.print(str.charAt(indx));
    reverseString(str, indx-1);
  }
  public static void main(String[] args) {
    String str= "Volvick";
    reverseString(str, str.length()-1);
  }
}
