import java.util.*;

public class SumOfNumber {
  public static void sum(int n) {
    int s =0;
    for (int i = 1; i <= n; i++) {
      s += i;
    }
    System.out.println("Sum of numbers from 1 to " + n + " is: " + s);
  } 
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number: ");
        int  n = sc.nextInt();
        sum(n);
   }  
}
