package BasicSorthing;

public class bubbleSort {
    public static void bubbleSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {2,5,3,6,20,25};
        bubbleSort(arr);
    }
}
