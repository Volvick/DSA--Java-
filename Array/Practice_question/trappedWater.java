package Practice_question;

public class trappedWater {
    public static int trappedWater(int height[]){
        int arrLength = height.length;
        int leftMax[] = new int[arrLength];
        int rightMax[] = new int[arrLength];

        //left max
        leftMax[0] = height[0];
        for (int i = 1; i < arrLength; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        //right max
        rightMax[arrLength - 1] = height[arrLength - 1];
        for (int i = arrLength - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        int trappedWater = 0;
        //find trap water
        for (int i = 0; i < arrLength; i++) {
             int waterLevel = Math.min(rightMax[i], leftMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int height[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(trappedWater(height));
    }
}
