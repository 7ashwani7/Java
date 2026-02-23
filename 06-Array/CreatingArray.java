public class CreatingArray {
    public static void main(String[] args) {
        // Creating an array of integers
        int[] numbers = new int[5]; // This creates an array that can hold 5 integers

        // Assigning values to the array
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        // int numbers[5] = {10, 20, 30, 40, 50}; // This is another way to initialize the array with values

        // Printing the values of the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}