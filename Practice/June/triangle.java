package June;

public class triangle {
  public static void main(String[] args) {
    int n = 5; int z =0,o=1;
    for (int i = 1; i <=5; i++) {
      for (int j = 1; j <=i; j++) {
        if ((i+j)%2==0) {
          System.out.print("0 ");
        }else{
          System.out.print("1 ");
        }
      }
      System.out.println();
    }
  }
}
