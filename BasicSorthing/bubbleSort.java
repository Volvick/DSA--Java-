package BasicSorthing;

public class bubbleSort {

    public void bubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag)
                break;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 6, 20, 25 };
        bubbleSort call = new bubbleSort();
        call.bubbleSort(arr);
    }
}
