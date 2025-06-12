package Practice;

public class sum {
  public static void sum(int nums[][]){
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[1][i];
    }
    System.out.println("Sum: "+sum);
  }
  public static void main(String[] args) {
    int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
    sum(nums);
  }
}
