package Practice_question;

public class repeat {
    public static boolean repeat(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 855, 25, 33, 3,1 };
        System.out.println(repeat(arr));
    }
}
