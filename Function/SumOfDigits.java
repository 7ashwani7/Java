public class SumOfDigits {
    public static void sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Sum of digits is: " + sum);
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sumOfDigits(n);
    }
}
