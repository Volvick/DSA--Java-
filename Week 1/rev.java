public class rev {
    public static void main(String[] args) {
        int n = 12345;
        int lastdigit;
        int rev=0;
        while (n!=0) {
            lastdigit = n%10;
            rev = (rev*10)+lastdigit;
            n/=10;
        }
        System.out.println(rev);
    }
}
