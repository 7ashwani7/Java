
import java.util.Scanner;

public class LengthString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        sb.append(sc.nextLine());
        System.out.println(sb.length());
    }
}
