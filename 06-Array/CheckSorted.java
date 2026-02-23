//Take an array of numbers as input and check if it is an array sorted in ascending order. 
import java.util.*;
class CheckSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int num[] = new int[size];
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            num [i] = sc.nextInt();
        }
        boolean isSorted = true;
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] > num[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("The array is sorted in ascending order.");
        } else {
            System.out.println("The array is not sorted in ascending order.");
        }
    }
}