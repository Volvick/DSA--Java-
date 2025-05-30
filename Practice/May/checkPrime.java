package May;

public class checkPrime {
  public static void isPrime(int n) {
    boolean flag = true;
    if (n == 2) {
      System.out.println("It's a even number");
    } else {
      for (int i = 2; i < Math.sqrt(n); i++) {
        if (n % i == 0) {
          flag = false;
        }
      }
    }
    System.out.println(flag == true ? "It's Prime" : "Not a Prime Number");
  }

  public static void main(String[] args) {
    int n = 11;
    isPrime(n);
  }
}
