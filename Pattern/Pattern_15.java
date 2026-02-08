//  Solid Rhombus
//         * * * * * 
//       * * * * * 
//     * * * * * 
//   * * * * * 
// * * * * * 
      
public class Pattern_15 {
    public static void main(String[] args) {
        int n = 5; // Size of the rhombus

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int k = 1; k <= n; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    
}
