public class factorial {
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static long biFac(int n, int r) {
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nr_fact = factorial(n - r);

        long biFac = n_fact / (r_fact * nr_fact);
        return biFac;
    }

    public static void main(String[] args) {
        System.out.println(biFac(20, 3));           
    }
}