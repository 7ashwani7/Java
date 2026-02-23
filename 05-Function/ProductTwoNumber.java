public class ProductTwoNumber {
    public static int porduct(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Product of " + a + " and " + b + " is: " + porduct(a, b));
    }
}
