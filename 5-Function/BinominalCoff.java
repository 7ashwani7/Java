
import java.util.Scanner;

public class BinominalCoff {
    public static int fact(int n) {
        int i=1;
        for(int j=1; j<=n; j++) {
            i = i * j;
        }
        return i;
    }
    public static int binominalCoff(int n, int r) {
        int fact_n=fact(n);
        int fact_r=fact(r);
        int fact_nMr=fact(n-r);
        return fact_n/(fact_r*fact_nMr);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter r: ");
        int r = sc.nextInt();
        System.out.println("Binomial coefficient is: " + binominalCoff(n, r));
    }
}