import java.util.ArrayList;
public class AddSetIndex {
public static void main(String[] args) {
    // Create an ArrayList of integers
    ArrayList<Integer> numbers = new ArrayList<>();

    // Add some elements to the ArrayList
    numbers.add(0,10);
    numbers.add(1,20);
    numbers.add(2,30);
    numbers.add(3,40);
    numbers.add(4,50);

    // Print the ArrayList
    System.out.println("Numbers: " + numbers);

    // Set an element at a specific index
    numbers.set(2, 25);
    System.out.println("Numbers: " + numbers);
    // Delete an element at a specific index
    numbers.remove(3);
    System.out.println("Numbers after removal: " + numbers);
    }
}
