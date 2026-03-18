//Ashwani Chauhan (2400320100318)//
import java.util.Scanner;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int i1 = sc.nextInt();
        int i2 = sc.nextInt();
        System.out.println("Result: " + calc.add(i1, i2));
        System.out.print("Enter two decimal values: ");
        double d1 = sc.nextDouble();
        double d2 = sc.nextDouble();
        System.out.println("Result: " + calc.add(d1, d2));
        System.out.print("Enter three integers: ");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        System.out.println("Result: " + calc.add(x1, x2, x3));
        sc.close();
    }
}


