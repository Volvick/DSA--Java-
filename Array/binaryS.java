package Array;

public class binaryS {
    public static void binaryS(int arr[], int key) {
        int f_index = 0;
        int l_index = arr.length - 1;
        int mid = (f_index + l_index) / 2;
        System.out.println(mid);
        for (int i = 0; i < arr.length; i++) {
            if (arr[mid] == key) {
                System.out.println("Element Index: " + mid);
                break;
            } 
            else if (arr[mid] > key) {
                mid -= 1;
            } else {
                mid += 1;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 5, 10, 12, 14, 18 };
        int key = 18;
        binaryS(arr, key);
    }
}
