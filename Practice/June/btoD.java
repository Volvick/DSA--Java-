package June;

public class btoD {
  public static void btoD(int n){
    int pow=0,dNum=0;
    while (n!=0) {
      int lastDigit = n%10;
      dNum += lastDigit*(int)Math.pow(2, pow);
      pow++;
      n/=10;
    }
    System.out.println(dNum);
  }
  public static void main(String[] args) {
    btoD(110);
  }
}
