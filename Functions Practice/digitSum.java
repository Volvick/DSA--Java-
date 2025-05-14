import java.util.Scanner;

public class digitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number:");
        int num = sc.nextInt();
        int sum = 0;
        while (num>0) {
            int lastdigit = num%10;
            sum+=lastdigit;
            num/=10;
        }
        System.out.println("The sum of digit: "+sum);
    }
}
