public class diamondPattern {
    public static void diamondPattern(int n){
        //upper part
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            for (int j = 2; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //mirror pattern
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=n+1-i; j++) {
                System.out.print("* ");
            }
            for (int j = 2; j <=n+1-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamondPattern(5);
    }
}
