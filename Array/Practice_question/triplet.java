package Practice_question;

public class triplet {
    public static void triplet(int arr[]){
        int triplet[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j+1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0){
                        triplet[i] = [arr[i] , arr[j] , arr[k]] ;
                    }
                }
            }
        }
        for (int i : triplet) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        int arr[] = {-1, 0,  1, 2, -1, -4};
        triplet(arr);
    }
}
