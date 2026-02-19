import java.util.Scanner;

public class BinaryToDecimal {
    static int BtoD(int n){
        int ans = 0, pow = 1;
        while(n > 0){
            int rem = n % 10;
            ans += (rem * pow);
            n /= 10;
            pow *= 2;
        }
        return ans;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("The decimal number is " + BtoD(num));
    }
}