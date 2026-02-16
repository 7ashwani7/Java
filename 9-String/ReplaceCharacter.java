//Input a string from the user. Create a new string called ‘result’ in which you 
 //will replace the letter ‘e’ in the original string with letter ‘i’.
 import java.util.*; 
public class ReplaceCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == 'e') {
                result += 'i';
            } else {
                result += currentChar;
            }
        }
        System.out.println("Resulting String: " + result);
    }
    
}
