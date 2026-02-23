import java.util.*;
class PrimeNumber {
    public static void main(String[] args) {
         boolean isPrime=true;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
         for( int i=2; i<=n-1;i++) {
                    if(n%i==0){
                        isPrime=false;
                        break;
                    }
                }
        if (isPrime && n > 1) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
        scanner.close();
    }
}
        