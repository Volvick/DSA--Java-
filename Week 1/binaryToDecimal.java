public class binaryToDecimal {
    public static void main(String[] args) {
        int n = 101;
        int dNum =0;
        int pow = 0;
        while(n>0)
        {
            int temp = n;
            n%=10;
            dNum = (int)Math.pow(2, n);
            n/=10;
        }
        System.out.println(dNum);
    }
}
