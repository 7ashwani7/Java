import java.util.*;
public class DeclareArrayList {
    public static void main(String[] args) {
        // Declare an ArrayList of Strings
        ArrayList<String> names = new ArrayList<>();

        // Add some elements to the ArrayList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Print the ArrayList
        System.out.println("Names: " + names);

        // Access an element by index
        String firstName = names.get(0);
        System.out.println("First name: " + firstName);

        // Remove an element
        names.remove("Bob");
        System.out.println("Names after removal: " + names);
    }
}