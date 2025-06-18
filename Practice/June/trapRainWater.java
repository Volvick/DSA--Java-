package June;

public class trapRainWater {
  public static void main(String[] args) {
    int arr[] = { 4, 2, 0, 6, 3, 2, 5 };
    int arrLen = arr.length;
    //right max array
    int rightMax[] = new int[arrLen];
    rightMax[0] = arr[0];
    for (int i = 1; i < arrLen; i++) {
        rightMax[i] = Math.max(arr[i], rightMax[i-1]);
    }
    //left max array
    int leftMax[] = new int[arrLen];
    leftMax[arrLen-1] = arr[arrLen-1];
    for (int i = arrLen-2; i >=0; i--) {
      leftMax[i] = Math.max(leftMax[i+1], arr[i]);
    }
    //calc
    int waterLevel = 0,trappedWater=0;
    for (int i = 0; i < arrLen; i++) {
      waterLevel = Math.min(leftMax[i], rightMax[i]);
      trappedWater += waterLevel-arr[i];
    }
    System.out.println(trappedWater);
  }
}
