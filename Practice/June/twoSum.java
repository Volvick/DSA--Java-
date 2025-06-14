package June;
//leetcode 1
public class twoSum {
  public static int[] twoSum(int nums[],int target){
    for (int i = 0; i < nums.length; i++) {
      for (int j = 1; j < nums.length; j++) {
        if (i!=j && nums[i]+nums[j] == target) {
          System.out.println(i+","+j);
          return new int[] {i,j};
        }
      }
    }
    return new int[] {-1};
  }
  public static void main(String[] args) {
    int arr[] = {2,5,5,11};
    int target = 10;
    System.out.println(twoSum(arr, target));
  }
}
