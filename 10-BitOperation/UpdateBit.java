
import java.util.Scanner;

public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the operation (1 for set, 0 for clear): ");
        int oper = sc.nextInt();
        int  n  =  5  ;  //0101 
        int  pos  =  1;
        int bitMask = 1 << pos;
        if(oper == 1){
            // set bit
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }  else{
            // clear bit
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
    
}
