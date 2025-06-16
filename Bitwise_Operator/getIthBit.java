package Bitwise_Operator;

public class getIthBit {
  public static int getIthBit(int n, int i) {
    int bitMask = 0b0001 << i;
    return (bitMask & n) != 0 ? 1 : 0;
  }

  public static void main(String[] args) {
    System.out.println(getIthBit(4, 1));
  }
}
