public class IRhalfpyramid {
    public static void IRhalfpyramid(int row) {
        for (int i = 1; i <= row; i++) {
            for (int k = 4; k > i; k--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        IRhalfpyramid(4);
    }
}