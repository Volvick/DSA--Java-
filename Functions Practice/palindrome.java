import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        int temp = num;
        int revNum = 0;
        while (num > 0) {
            int lastdigit = num % 10;
            revNum = (revNum * 10) + lastdigit;
            num /= 10;
        }
        System.out.println((temp == revNum) ? "It's a Palindrome Number" : "It's not a Palindrome Number");
    }
}