package Practice;

public class trapRainWater {
    public static int trapRainWater(int arr[]){
        int n=arr.length;
        //calculate left max boundary
        int lm[]=new int[n];
        lm[0]= arr[0];
        for (int i = 1; i < lm.length; i++) {
            lm[i]=Math.max(lm[i-1], arr[i]);
        }
        //calculate right max
        int rm[]=new int[n];
        rm[n-1]=arr[n-1];
        for (int i = n-2; i >=0; i--) {
            rm[i]=Math.max(rm[i+1], arr[i]);
        }
        //calculate Water trapped
        int trappedWater=0;
        for (int i = 0; i < n; i++) {
            int min= Math.min(lm[i], rm[i]);
            trappedWater+=(min-arr[i])*1;
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int arr[] = {4,2,0,6,3,2,5};
       System.out.println(trapRainWater(arr));
    }
}
