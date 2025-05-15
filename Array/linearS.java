package Array;

public class linearS {
    public static int linearS(int num[], int key) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int num[] = { 2, 4, 5, 34, 24, 23, 90, 87 };
        int key = 34;
        System.out.println("Index of: "+key+": "+linearS(num, key));
    }
}
