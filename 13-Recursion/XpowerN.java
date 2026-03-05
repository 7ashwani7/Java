//Print x^n (with stack height = n)
import java.util.*;
public class XpowerN {
    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
         if(n % 2 == 0){
            int halfPower = power(x, n / 2);
            return halfPower * halfPower;
        } else {
            int halfPower = power(x, n / 2);
            return x * halfPower * halfPower;
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base (x): ");
        int x = sc.nextInt();
        System.out.print("Enter exponent (n): ");
        int n = sc.nextInt();
        int result = power(x, n);
        System.out.println(x + "^" + n + " = " + result);
    }
}
