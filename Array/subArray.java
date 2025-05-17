

public class subArray {
    public static void subArray(int arr[]) {
        int subArray = 0, total = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2] + " ");
                    total += arr[j2];
                }
                System.out.print("|Total: " + total + "|");

                if (total > max) {
                    max = total;
                }
                if (total < min) {
                    min = total;
                }

                total = 0;
                subArray++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total SubArray: " + subArray);
        System.out.println("Maximum of Sum: " + max);
        System.out.println("Minimum of Sum: " + min);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        int totSb=arr.length;
        System.out.println("totalsubarray: "+ totSb*(totSb+1)/2);
        subArray(arr);
    }
}
