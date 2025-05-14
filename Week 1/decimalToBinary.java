public class decimalToBinary {
    public static void main(String[] args) {
        int n = 11, temp = n, newNum = 0, rem,lastdigit,bNum=0;
        while (n > 0) {
            rem = n % 2;
            n = n / 2;
            newNum = (newNum * 10) + rem;
        }
        //reversing the digit
        while (newNum!=0) {
             lastdigit = newNum%10;
            bNum = (bNum*10)+lastdigit;
            newNum/=10;
        }
        System.out.println("Decimal to Binary Conversion of "+temp+" is: "+bNum);
    }
}
