package Bitwise_Operator;

public class fastExponent {
  public static int fastExponent(int a,int n){
    int ans =1;
    while(n>0){
      if ((n&1)!=0) {//check LSB
        ans = ans * a;
      }
      a = a*a;
      n>>=1;
    }
    return ans;
  }
  public static void main(String[] args) {
    System.out.println(fastExponent(3, 5));
  }
}
