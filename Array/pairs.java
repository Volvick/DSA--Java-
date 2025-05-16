package Array;

public class pairs {
    public static void pairs(int arr[]) {
        int c =arr.length-1;
        for (int i = 0; i < 4; i++) {
            int counter=3;
            for (int j = 0; j < 3 + 1 - i; j++) {
                System.out.print("("+arr[i]+","+arr[j+(i+1)]+") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10 };
        pairs(arr);
    }
}
