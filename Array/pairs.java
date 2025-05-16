package Array;

public class pairs {
    public static void pairs(int arr[]) {
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < (arr.length - 1) - i; j++) {
        // System.out.print("(" + arr[i] + "," + arr[j + (i + 1)] + ") ");
        // }
        // System.out.println();
        // }
        //optimized code
        int paris=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ") ");
                paris++;
            }
            System.out.println();
        }
        System.out.println("total: "+paris);
        // total pairs we can calculate with extra variable and also with n(n-1)/2;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        pairs(arr);
        int n=arr.length;
        System.out.println("Pairs: " +  n*(n-1)/2 );

    }
}
