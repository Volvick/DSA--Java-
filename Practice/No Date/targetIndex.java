public class targetIndex {
    public static int targetIndex(int arr[], int target) {
        int lo = 0, hi = arr.length - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            // left half is sorted
            if (arr[lo] <= arr[mid]) {
                if (arr[lo] <= target && target < arr[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
            // right half is sorted
            else {
                if (arr[mid] < target && target <= arr[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 3;
        System.out.println(targetIndex(arr, target));  // Output: 4
    }
}
