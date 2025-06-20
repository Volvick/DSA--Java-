package June;

public class dtoB {
  public static void dtoB(int n){
    int bNum =0,pow = 0;
    while (n > 0) {
           int rem = n % 2;
           bNum += rem*(Math.pow(10, pow));
           pow++;
           n = n / 2;
        }
    System.out.println(bNum);
  }
  public static void main(String[] args) {
    dtoB(10);
  }
}
