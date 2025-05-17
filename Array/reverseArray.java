

public class reverseArray {
    public static void print(int arr[]){
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void reverseArray(int arr[]) {
        int f_index = 0, l_index = arr.length - 1;
        while (f_index <= l_index) {
            int temp = arr[f_index];
            arr[f_index] = arr[l_index];
            arr[l_index] = temp;
            f_index++;
            l_index--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 23, 43, 53, 5, 13, 54, 88 };
        print(arr);
        reverseArray(arr); 
        print(arr);
    }
}
