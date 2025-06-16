package Bitwise_Operator;

public class updateIthBit {
  public static int setIthbit(int n, int i) {
    int bitMask = (1 << i);
    return (n | bitMask);
  }

  public static int clearIthBit(int n, int i) {
    int bitMask = ~(1 << i);
    return (n & bitMask);
  }

  public static int updateIthBit(int n, int i, int newBit) {
    // return (newBit == 0) ? clearIthBit(n, i) : setIthbit(n, i);
    n = clearIthBit(n, i);
    int bitMask = newBit<<i;
    return (n|bitMask);
  }

  public static void main(String[] args) {
    // System.out.println(setIthbit(10, 2));
    System.out.println(updateIthBit(10, 2, 1));
  }
}
