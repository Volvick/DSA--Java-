package June;

public class palindrome {
  public static void main(String[] args) {
    int n =1021;
    int temp = n;
    int revNum =0;
    while (n>0) {
      int lastdigit = n%10;
      revNum = (revNum*10)+lastdigit;
      n/=10;
    }
    if (temp == revNum) {
      System.out.println("It's palindrome");
    }else{
      System.out.println("Not a palindrome");
    }
  }
}
