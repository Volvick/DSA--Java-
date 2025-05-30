public class firstLastPosition {
    public static void firstLastPosition(int nums[], int target) {
        int arrLength = nums.length;
        int lo = 0;
        int hi = arrLength - 1;
        for (int i = 0; i < nums.length; i++) {
            int mid = (lo + hi) / 2;
            if (nums[mid] == target) {
                // to check other possible index
                if (nums[mid - 1] == target)
                    System.out.println("Index: " + (mid - 1));
                else if (nums[mid + 1] == target)
                    System.out.println("Index: " + (mid + 1));
                // printing first index
                System.out.println("Index: " + mid);
                break;

            } else if (nums[mid] > target)
                hi = mid - 1;
            else if (nums[mid] < target)
                lo = mid + 1;

        }
    }

    public static void main(String[] args) {
        int nums[] = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        firstLastPosition(nums, target);
    }
}