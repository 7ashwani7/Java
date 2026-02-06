    // A B C D 
    // A B C D 
    // A B C D 
    // A B C D 
public class Pattern_2 {
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < m; j++) {
                char ch = (char) ('A' + j);
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    
}
