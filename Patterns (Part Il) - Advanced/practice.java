public class practice {
    public static void tri(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n-i); j++) {//can also use j< n+1-i
                System.out.print("  ");
            }
            for (int k = 1; k<=i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        tri(5);
    }
}
