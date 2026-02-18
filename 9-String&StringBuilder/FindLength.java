
import java.util.*;

public class FindLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.println("The length of the string is: " + str.length());
    }
}
//                OR
//         int length = findLength(str);
//         System.out.println("The length of the string is: " + length);
//     }

//     public static int findLength(String str) {
//         int count = 0;
//         for (char c : str.toCharArray()) {
//             count++;
//         }
//         return count;
//     }
// }