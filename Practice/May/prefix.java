package May;

public class prefix {
  public static void prefix(int arr[]) {
    int n = arr.length;
    int prefix[] = new int[n];
    prefix[0] = arr[0];
    for (int i = 1; i < prefix.length; i++) {
      prefix[i] = prefix[i - 1] + arr[i];
    }
    int sum = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        sum = i == 0 ? sum = prefix[j] : prefix[j] - prefix[i - 1];
        System.out.print(" sum: " + sum + ", ");
        System.out.println();
        if (sum > max)
          max = sum;
        if (min > sum)
          min = sum;
      }
      System.out.println();
      sum = 0;
    }
    System.out.println("Maximum: " + max);
    System.out.println("Mininmum: " + min);
  }

  public static void main(String[] args) {
    int arr[] = { 1, -2, 6, -1, 3 };
    prefix(arr);
  }
}
