package June;

public class maxSubArray {
  public static void maxSubArray(int arr[]){
    int sum = 0,min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length; i++) {
      for (int j = i; j < arr.length; j++) {
        for (int j2 = j; j2 < arr.length; j2++) {
          System.out.print(arr[j2]+" ");
          sum += arr[j2];
        }
        if (sum<min)
          min = sum;
        if(sum>max)
          max = sum;
        System.out.print("Sum: "+sum);
        sum=0;
        System.out.println();
      }
      System.out.println();
    }
    System.out.print("Max: "+max+" ");
    System.out.print("Min: "+min);
  }
  public static void main(String[] args) {
    int arr[] = { 2, 4, 6, 8, 10 };
    maxSubArray(arr);
  }
}
