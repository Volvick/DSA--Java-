public class kadane_algo {
    public static void kadane_algo(int arr[]) {
        int cs = 0, ms = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            cs+=arr[i];
            if (cs<0) {
                cs=0;
            }
            ms=Math.max(cs, ms);
        }
        System.out.println("Maximum sub array Sum: "+ms);
    }

    public static void main(String[] args) {
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadane_algo(arr);
    }
}
