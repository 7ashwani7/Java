
import java.util.Scanner;

//  Remove duplicates in a string.
public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char ch = str.charAt(0);
        String rest = str.substring(1);
        if (rest.indexOf(ch) != -1) {
            return removeDuplicates(rest);
        } else {
            return ch + removeDuplicates(rest);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println(removeDuplicates(str));
    }
}