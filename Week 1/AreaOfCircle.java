import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 33, b = 32, c = 45;
        System.out.println((a > b) ? (a > c ? a : c) : (b > c ? b : c));

    }
}