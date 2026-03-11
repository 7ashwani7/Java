//Ashwani Chauhan (2400320100318)//
import java.util.Scanner;

public class JaggedArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the number of rows (n): ");
        n = sc.nextInt();
        int[][] arr = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the number of columns for row " + i + ": ");
            int cols = sc.nextInt();
            arr[i] = new int[cols];
        }
        System.out.println("\nEnter the values for the array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("Element [%d][%d]: ", i, j);
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("\nYour Jagged Array:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); 
        }
        sc.close();
    }
}