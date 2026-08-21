public class DoWhileLoop {
    public static void main(String[] args) {

        // 1. Basic Do While Loop
        int i1 = 1;

        do {
            System.out.println(i1);
            i1++;
        } while (i1 <= 5);


        // 2. Do While With False Condition
        int i2 = 10;

        do {
            System.out.println("Executed");
        } while (i2 < 5);


        // 3. Print 5 to 1
        int i3 = 5;

        do {
            System.out.println(i3);
            i3--;
        } while (i3 >= 1);


        // 4. Even Numbers
        int i4 = 2;

        do {
            System.out.println(i4);
            i4 += 2;
        } while (i4 <= 10);


        // 5. Sum from 1 to N
        int n1 = 5;
        int i5 = 1;
        int sum1 = 0;

        do {
            sum1 += i5;
            i5++;
        } while (i5 <= n1);

        System.out.println("Sum: " + sum1);


        // 6. Factorial
        int n2 = 5;
        int i6 = 1;
        long fact = 1;

        do {
            fact *= i6;
            i6++;
        } while (i6 <= n2);

        System.out.println("Factorial: " + fact);


        // 7. Break
        int i7 = 1;

        do {
            if (i7 == 4) {
                break;
            }

            System.out.println(i7);
            i7++;
        } while (i7 <= 10);


        // 8. Continue
        int i8 = 0;

        do {
            i8++;

            if (i8 == 3) {
                continue;
            }

            System.out.println(i8);

        } while (i8 < 5);


        // 9. Reverse a Number
        int number1 = 1234;
        int reverse1 = 0;

        do {
            int digit = number1 % 10;
            reverse1 = reverse1 * 10 + digit;
            number1 /= 10;
        } while (number1 > 0);

        System.out.println("Reverse: " + reverse1);


        // 10. Count Digits
        int number2 = 0;
        int count1 = 0;

        do {
            count1++;
            number2 /= 10;
        } while (number2 != 0);

        System.out.println("Digits: " + count1);


        // 11. Sum of Digits
        int number3 = 1234;
        int sum2 = 0;

        do {
            int digit = number3 % 10;
            sum2 += digit;
            number3 /= 10;
        } while (number3 > 0);

        System.out.println("Digit Sum: " + sum2);


        // 12. Palindrome Number
        int number4 = 121;
        int original = number4;
        int reverse2 = 0;

        do {
            int digit = number4 % 10;
            reverse2 = reverse2 * 10 + digit;
            number4 /= 10;
        } while (number4 > 0);

        if (original == reverse2) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }


        // 13. Nested Do While
        int row = 1;

        do {
            int col = 1;

            do {
                System.out.print("*");
                col++;
            } while (col <= 3);

            System.out.println();
            row++;

        } while (row <= 3);


        // 14. Menu Driven Example
        int choice = 1;

        do {
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Exit");

            choice = 3;

        } while (choice != 3);

        System.out.println("Program Ended");
    }
}