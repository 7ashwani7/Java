import java.util.*;
public class SumTwoNumber {
    public static int sum(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Sum of " + a + " and " + b + " is: " + sum(a, b));
    }
}
