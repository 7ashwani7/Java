import java.util.Scanner;

public class DecimalToBinary {
    static int DtoB(int n){
        int ans = 0, pow = 1;
        while(n > 0){
            int rem = n % 2;
            n /= 2;
            ans += (rem * pow);
            pow *= 10;
        }
        return ans;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("The binary number is " + DtoB(num));
        sc.close();
    }
}