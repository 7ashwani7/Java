//ASHWANI CHAUHAN (2400320100318)//
import java.util.Scanner;
class Matrix {
    public int[][] addMatrix(int[][] A, int[][] B, int r, int c) {
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][i] = A[i][j] + B[i][j];
            }
        }
        return res;
    }
    public int[][] subMatrix(int[][] A, int[][] B, int r, int c) {
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = A[i][j] - B[i][j];
            }
        }
        return res;
    }
    public void printMatrix(int[][] matrix, int r, int c) {
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class TestMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Matrix obj = new Matrix();

        System.out.print("Enter rows and columns: ");
        int rows = input.nextInt();
        int cols = input.nextInt();

        int[][] matA = new int[rows][cols];
        int[][] matB = new int[rows][cols];

        System.out.println("Enter Matrix A:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) matA[i][j] = input.nextInt();

        System.out.println("Enter Matrix B:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) matB[i][j] = input.nextInt();

        System.out.println("\nAddition:");
        int[][] sum = obj.addMatrix(matA, matB, rows, cols);
        obj.printMatrix(sum, rows, cols);

        System.out.println("\nSubtraction:");
        int[][] diff = obj.subMatrix(matA, matB, rows, cols);
        obj.printMatrix(diff, rows, cols);

        input.close();
    }
}