//Ashwani Chauhan (2400320100318)//
import java.util.Scanner;
public class MatrixAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r, c;
        System.out.print("Enter the number of rows: ");
        r = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        c = sc.nextInt();
        int[][] A = new int[r][c];
        int[][] B = new int[r][c];
        int[][] Sum = new int[r][c];
        System.out.println("Enter elements for Matrix A:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements for Matrix B:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                B[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                Sum[i][j] = A[i][j] + B[i][j];
            }
        }
        System.out.println("Resultant Matrix (Sum):");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(Sum[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}