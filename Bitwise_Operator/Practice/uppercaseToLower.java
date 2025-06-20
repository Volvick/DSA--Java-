package Bitwise_Operator.Practice;

public class uppercaseToLower {
  public static void main(String[] args) {
    char upper = 'A';
    char lower = (char) (upper | 32);//== ' '
    System.out.println(lower);
  }
}
