package Array;

public class subArray {
    public static void subArray(int arr[]) {

        for (int m = 0; m < arr.length; m++) {
            for (int i = 0; i < arr.length; i++) {
                for (int k = m; k <= i; k++) {
                    System.out.print(arr[k] + ", ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        subArray(arr);
    }
}
