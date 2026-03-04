import java.util.*;
public class SumOfN {
    public static int sumOfN(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfN(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");   
        int n = sc.nextInt();
        int sum = sumOfN(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
    }
}
