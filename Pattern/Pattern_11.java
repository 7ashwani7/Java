    //Pyramid Number Pattern
    //         1 
    //       1 2 1
    //     1 2 3 2 1
    //   1 2 3 4 3 2 1
public class Pattern_11 {
    public static void main(String[] args) {
        int n = 4;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=i; k++){
                System.out.print(k+" ");
            }
            for(int k=i-1; k>=1; k--){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
