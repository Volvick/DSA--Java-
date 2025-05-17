
public class maxSubArray {
    public static void maxSubArray(int arr[]) {
        int subArrayTotal=0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2] + ", ");
                    subArrayTotal+=arr[j2];
                }
                System.out.println("SubArrayTotal: "+subArrayTotal);
                if (subArrayTotal>max) {
                    max=subArrayTotal;
                }
                if (subArrayTotal<min) {
                    min=subArrayTotal;
                }
                subArrayTotal=0;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);
    }

    public static void main(String[] args) {
        // int arr[] = { 2, 4, 6, 8, 10 };
        int arr[] = { 1, -2, 6, -1, 3 };
        maxSubArray(arr);
    }
}
