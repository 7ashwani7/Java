
import java.util.*;

public class Print1ToN {
    public static void printNumber(int n) {
        if (n == 0) {
            return;
        }
        printNumber(n - 1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");   
        int n = sc.nextInt();
        printNumber(n);
    }
    
}