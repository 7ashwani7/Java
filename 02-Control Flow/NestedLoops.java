public class NestedLoops {
    public static void main(String[] args) {

        // 1. Basic Nested Loop
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
            }
        }


        // 2. Square Pattern
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        // 3. Rectangle Pattern
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 6; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        // 4. Right Triangle
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        // 5. Inverted Triangle
        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        // 6. Number Triangle
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }


        // 7. Repeated Number Triangle
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println();
        }


        // 8. Reverse Number Triangle
        for (int i = 5; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }


        // 9. Number Pyramid
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j);
            }

            System.out.println();
        }


        // 10. Star Pyramid
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        // 11. Multiplication Tables
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println();
        }


        // 12. Matrix Traversal
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }


        // 13. Matrix Sum
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        System.out.println("Matrix Sum: " + sum);


        // 14. Matrix Maximum
        int max = matrix[0][0];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }

        System.out.println("Matrix Maximum: " + max);


        // 15. Count Even Numbers
        int count = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] % 2 == 0) {
                    count++;
                }
            }
        }

        System.out.println("Even Count: " + count);


        // 16. Nested While Loop
        int i1 = 1;

        while (i1 <= 3) {

            int j1 = 1;

            while (j1 <= 3) {
                System.out.println(i1 + " " + j1);
                j1++;
            }

            i1++;
        }


        // 17. Nested Do While Loop
        int i2 = 1;

        do {
            int j2 = 1;

            do {
                System.out.print("*");
                j2++;
            } while (j2 <= 3);

            System.out.println();
            i2++;

        } while (i2 <= 3);


        // 18. Break in Nested Loop
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                if (j == 2) {
                    break;
                }

                System.out.println(i + " " + j);
            }
        }


        // 19. Labeled Break
        outer:
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {

                if (i == 2 && j == 2) {
                    break outer;
                }

                System.out.println(i + " " + j);
            }
        }


        // 20. Pair Generation
        int[] arr = {10, 20, 30};

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }


        // 21. All Subarrays
        int[] values = {1, 2, 3};

        for (int i = 0; i < values.length; i++) {

            for (int j = i; j < values.length; j++) {

                for (int k = i; k <= j; k++) {
                    System.out.print(values[k] + " ");
                }

                System.out.println();
            }
        }
    }
}