
import java.util.*;

public class InputName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int size = sc.nextInt();
        String names[] = new String[size];
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.next();
        }
        System.out.println("Names of the students:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Student " + (i + 1) + ": " + names[i]);
        }
    }
}
