package June;

public class diamond {
  public static void main(String[] args) {
    int n = 5;
    //for upper part
    for (int i = 1; i <=n; i++) {
      for (int j = 1; j <n+1-i; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <2*i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    // for lower part
    for (int i = 5; i >0; i--) {
      for (int j = 1; j <n+1-i; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <2*i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
