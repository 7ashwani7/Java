//Ashwani Chauhan (2400320100318)//
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = s.nextInt();
        
        int t = n, r = 0;
        
        while (t > 0) {
            r = r * 10 + (t % 10);
            t /= 10;
        }
        if (n == r) {
            System.out.println(n + " is a Palindrome.");
        } else {
            System.out.println(n + " is not a Palindrome.");
        }
        s.close();
    }
}