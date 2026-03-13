//Ashwani Chauhan (2400320100318)//
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (n <= 1) {
            System.out.println(n + " is Not Prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break; 
                }
            }

            if (isPrime) {
                System.out.println(n + " is a Prime Number");
            } else {
                System.out.println(n + " is Not Prime");
            }
        }
        
        sc.close();
    }
}