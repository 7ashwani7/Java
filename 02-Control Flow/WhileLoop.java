public class WhileLoop {
    public static void main(String[] args) {

        // 1. Basic While Loop
        int i1 = 1;

        while (i1 <= 5) {
            System.out.println(i1);
            i1++;
        }


        // 2. Print 1 to 10
        int i2 = 1;

        while (i2 <= 10) {
            System.out.println(i2);
            i2++;
        }


        // 3. Print 10 to 1
        int i3 = 10;

        while (i3 >= 1) {
            System.out.println(i3);
            i3--;
        }


        // 4. Even Numbers
        int i4 = 2;

        while (i4 <= 10) {
            System.out.println(i4);
            i4 += 2;
        }


        // 5. Odd Numbers
        int i5 = 1;

        while (i5 <= 10) {
            System.out.println(i5);
            i5 += 2;
        }


        // 6. Sum from 1 to N
        int n1 = 5;
        int i6 = 1;
        int sum1 = 0;

        while (i6 <= n1) {
            sum1 += i6;
            i6++;
        }

        System.out.println("Sum: " + sum1);


        // 7. Multiplication Table
        int table = 5;
        int i7 = 1;

        while (i7 <= 10) {
            System.out.println(table + " x " + i7 + " = " + (table * i7));
            i7++;
        }


        // 8. Factorial
        int n2 = 5;
        int i8 = 1;
        long fact = 1;

        while (i8 <= n2) {
            fact *= i8;
            i8++;
        }

        System.out.println("Factorial: " + fact);


        // 9. Break
        int i9 = 1;

        while (i9 <= 10) {

            if (i9 == 6) {
                break;
            }

            System.out.println(i9);
            i9++;
        }


        // 10. Continue
        int i10 = 0;

        while (i10 < 5) {
            i10++;

            if (i10 == 3) {
                continue;
            }

            System.out.println(i10);
        }


        // 11. Infinite Loop with Break
        int i11 = 1;

        while (true) {

            System.out.println(i11);

            if (i11 == 5) {
                break;
            }

            i11++;
        }


        // 12. Reverse a Number
        int number1 = 1234;
        int reverse = 0;

        while (number1 > 0) {
            int digit = number1 % 10;
            reverse = reverse * 10 + digit;
            number1 /= 10;
        }

        System.out.println("Reverse: " + reverse);


        // 13. Count Digits
        int number2 = 12345;
        int count = 0;

        while (number2 > 0) {
            count++;
            number2 /= 10;
        }

        System.out.println("Digits: " + count);


        // 14. Count Digits with Zero
        int number3 = 0;
        int count2;

        if (number3 == 0) {
            count2 = 1;
        } else {
            count2 = 0;

            while (number3 != 0) {
                count2++;
                number3 /= 10;
            }
        }

        System.out.println("Digits: " + count2);


        // 15. Sum of Digits
        int number4 = 1234;
        int sum2 = 0;

        while (number4 > 0) {
            int digit = number4 % 10;
            sum2 += digit;
            number4 /= 10;
        }

        System.out.println("Digit Sum: " + sum2);


        // 16. Palindrome Number
        int number5 = 121;
        int original = number5;
        int reverse2 = 0;

        while (number5 > 0) {
            int digit = number5 % 10;
            reverse2 = reverse2 * 10 + digit;
            number5 /= 10;
        }

        if (original == reverse2) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }


        // 17. Count Digits and Sum
        int number6 = 12345;
        int count3 = 0;
        int sum3 = 0;

        while (number6 > 0) {
            int digit = number6 % 10;
            count3++;
            sum3 += digit;
            number6 /= 10;
        }

        System.out.println("Digits: " + count3);
        System.out.println("Sum: " + sum3);
    }
}