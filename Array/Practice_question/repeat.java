package Practice_question;

public class repeat {
    public static boolean repeat(int arr[]) {
        int n = arr.length;
        int numCheck[] = new int[n];
        for (int i = 0; i < n; i++) {
            numCheck[i] = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (numCheck[i] == arr[j])
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 855, 25, 33, 3 };
        System.out.println(repeat(arr));
    }
}
