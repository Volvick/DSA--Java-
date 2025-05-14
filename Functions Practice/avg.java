import java.util.Scanner;

public class avg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Numbers:");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        int sum = a + b + c;
        System.out.println("Average of the three numbers: " + (sum / 3));
    }
}