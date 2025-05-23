package Practice_question;

public class targetIndex {
    public static int targetIndex(int arr[], int target) {
        int arrLength = arr.length;
        int lo = 0;
        int hi = arrLength - 1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            // left half is sorted
            else if (arr[lo] <= target) {
                // target lies in the left half
                if (target <= arr[mid]) {
                    hi = mid - 1;
                } // target lies in the right half
                else {
                    lo = mid + 1;
                }
            }
            // right half is sorted
            else {
                if (arr[mid] >= target) {
                    lo = mid + 1;
                } // target lies in the right half
                else {
                    hi = mid - 1;
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 4;
        System.out.println(targetIndex(arr, target));
    }
}
