public class optDecimalToBinary {
    public static void binToDec(int n){
        int pow = 0,bNum = 0,temp=n;

        while (n>0) {
            int rem = n%2;
            bNum = bNum + (rem*(int)Math.pow(10, pow));
            n/=2;
            pow++;
        }
        System.out.println("The binary conversion of "+temp+"is: "+bNum);
    }
    public static void main(String[] args) {
        binToDec(7);
    }
}
