public class isPrime {
    public static boolean isPrime(int n) {
        boolean flag = true;
        if (n == 2) {
            flag = true;
        } else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = false;
                }
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(113));
        for (int i = 2; i <= 40; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}