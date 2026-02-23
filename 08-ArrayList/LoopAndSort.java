import java.util.ArrayList;
import java.util.Collections;
public class LoopAndSort {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Print the ArrayList
        System.out.println("Numbers: " + numbers);

        // Loop through the ArrayList and print each element
        System.out.println("Looping through the ArrayList:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // Sort the ArrayList in ascending order
        Collections.sort(numbers);
        System.out.println("Sorted Numbers: " + numbers);

        // Sort the ArrayList in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted Numbers in Descending Order: " + numbers);
    }
    
}
