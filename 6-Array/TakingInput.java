
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        // Taking input from the user
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int marks[] = new int[size];
        // Taking input for the array elements
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }
        // Printing the values of the array
        System.out.println("Marks of the students:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + marks[i]);
        }
    }
}
