package Bitwise_Operator;

public class clearLastIthBit {
  public static int clearLastIthBit(int n,int i){
    int bitMask = (~0)<<i;//take ~0 or -1
    return (n & bitMask);
  }
  public static void main(String[] args) {
    System.out.println(clearLastIthBit(15, 2));
  }
}
