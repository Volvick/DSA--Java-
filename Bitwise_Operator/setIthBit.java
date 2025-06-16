package Bitwise_Operator;

public class setIthBit {
  public static int getIthBit(int n, int i) {
    int bitMask = 0b0001 << i;
    return (n | bitMask);
  }

  public static void main(String[] args) {
    System.out.println(getIthBit(10, 2));
  }
}
