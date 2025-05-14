public class triangle {
    public static void zero_oneTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i % 2 != 0 && j % 2 == 0) || (i % 2 == 0 && j % 2 != 0)) {
                    //condition can also be if((i+j)%2==0) print 1 else 0
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        zero_oneTriangle(5);
    }
}