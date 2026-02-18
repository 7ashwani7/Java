import java.util.*;
public class RevesreStrings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        sb.append(sc.nextLine());
        StringBuilder reversed = new StringBuilder();
        // sb.reverse();
        // System.out.println(sb);
        for(int i = sb.length() - 1; i >= 0; i--){
            reversed.append(sb.charAt(i));
        }
        System.out.println(reversed);
    }
}