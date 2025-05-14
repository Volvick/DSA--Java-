public class bToD {
    public static void main(String[] args) {
        int n = 110;
        int pow = 0;
        int dNum = 0;
        int temp = n;
        while (n!=0) {
            int lastDigit  = n%10;
            System.out.println(lastDigit);
            dNum += lastDigit*(int) Math.pow(2, pow);
            pow++;
            n/=10;
        }
        System.out.println("The Decimal Number of "+temp+" is: "+dNum);
    }
}
