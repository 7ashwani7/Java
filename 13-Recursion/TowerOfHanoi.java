
import java.util.Scanner;

public class TowerOfHanoi {
    public static void TOH(int n, char source, char destination, char helper) {
        if (n == 0) {
            return;
        }
        TOH(n - 1, source, helper, destination);
        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        TOH(n - 1, helper, destination, source);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of disks: ");    
        int n = sc.nextInt();
        TOH(n, 'A', 'C', 'B');
    }
}
