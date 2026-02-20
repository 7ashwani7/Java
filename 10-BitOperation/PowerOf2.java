// Write a program to find if a number is a power of 2 or not.
import java.util.*; 
public class PowerOf2 {
    public static boolean isPowerOf2(int n) {
        if(n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        if(isPowerOf2(n)) {
            System.out.println(n + " is a power of 2.");
        } else {
            System.out.println(n + " is not a power of 2.");
        }
        
    }
}
