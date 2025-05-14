public class IHPnum {
    public static void IHPnum(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n;j>1; j--) {
                System.out.print("$");
            }
            for (int j = 1; j <=(n+1-i); j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        IHPnum(5);
    }
}
