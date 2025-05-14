import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = sc.nextInt();
        boolean flag = true;
        if (n == 2)
            System.out.println("It's a Prime Number");
        else {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    flag = false;
                }
            }
            System.out.println(flag == true ? "Its Prime" : "Not Prime");
        }
    }
}
