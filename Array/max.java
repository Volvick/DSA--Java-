package Array;

public class max {
    public static int max(int num[]){
        int max=num[0],min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]>max) {
                max = num[i];
            }
            if (num[i]<min) {
                min = num[i];
            }
        }
        System.out.println("The Minimum :"+min);
        return max;
    }
    public static void main(String[] args) {
        int num[] ={54,34,65,45,3581,6,234,423};
        System.out.println("The Maximum: "+max(num));
    }
}
