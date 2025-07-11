package Recursion;

public class FriendsPairing {
  static int findPair(int n) {
    if (n == 1 || n == 2) {
      return n;
    }
    return findPair(n - 1) + (n - 1) * findPair(n - 2);
  }

  public static void main(String[] args) {
    System.out.println(findPair(3));
  }
}
