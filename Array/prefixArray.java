public class prefixArray {
    public static void prefixArray(int arr[]) {
        int prefixArray[] = new int[arr.length];
        // prefix Array
        prefixArray[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefixArray[i] = prefixArray[i - 1] + arr[i];
        }
        // to print subarray and get sum,it's max and min
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                sum = start == 0 ? sum = prefixArray[end] : prefixArray[end] - prefixArray[start - 1];
                System.out.print(" sum: " + sum + ", ");
                System.out.println();
                if (max < sum)
                    max = sum;
                if (min > sum)
                    min = sum;
                sum = 0;
            }
            System.out.println();
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        prefixArray(arr);
    }
}