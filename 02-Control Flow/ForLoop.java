public class ForLoop {
    public static void main(String[] args) {

        // 1. Basic For Loop
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        // 2. Print 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        // 3. Print 10 to 1
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }


        // 4. Even Numbers
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }


        // 5. Odd Numbers
        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }


        // 6. Increment by 3
        for (int i = 1; i <= 10; i += 3) {
            System.out.println(i);
        }


        // 7. Sum from 1 to N
        int n = 5;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum: " + sum);


        // 8. Multiplication Table
        int table = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(table + " x " + i + " = " + (table * i));
        }


        // 9. Factorial
        int number = 5;
        long fact = 1;

        for (int i = 1; i <= number; i++) {
            fact *= i;
        }

        System.out.println("Factorial: " + fact);


        // 10. Reverse Counting by 2
        for (int i = 20; i >= 1; i -= 2) {
            System.out.println(i);
        }


        // 11. Nested For Loop
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
            }
        }


        // 12. Square Pattern
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        // 13. Triangle Pattern
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }


        // 14. Number Pattern
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }


        // 15. Break
        for (int i = 1; i <= 10; i++) {

            if (i == 6) {
                break;
            }

            System.out.println(i);
        }


        // 16. Continue
        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue;
            }

            System.out.println(i);
        }


        // 17. Multiple Variables
        for (int i = 1, j = 5; i <= 5; i++, j--) {
            System.out.println(i + " " + j);
        }


        // 18. Array Traversal
        int[] arr = {10, 20, 30, 40, 50};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        // 19. Find Maximum in Array
        int[] values = {10, 50, 20, 80, 30};

        int max = values[0];

        for (int i = 1; i < values.length; i++) {

            if (values[i] > max) {
                max = values[i];
            }
        }

        System.out.println("Maximum: " + max);


        // 20. Infinite Loop With Break
        int count = 1;

        for (;;) {

            System.out.println(count);

            if (count == 5) {
                break;
            }

            count++;
        }
    }
}