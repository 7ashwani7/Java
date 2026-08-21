public class Operators {
    public static void main(String[] args) {

        // 1. Arithmetic Operators
        int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));


        // 2. Decimal Division
        double x = 10.0;
        double y = 3.0;

        System.out.println("Decimal Division: " + (x / y));


        // 3. Relational Operators
        int p = 10;
        int q = 20;

        System.out.println("Equal: " + (p == q));
        System.out.println("Not Equal: " + (p != q));
        System.out.println("Greater: " + (p > q));
        System.out.println("Less: " + (p < q));
        System.out.println("Greater or Equal: " + (p >= q));
        System.out.println("Less or Equal: " + (p <= q));


        // 4. Logical AND
        System.out.println("AND: " + (true && true));
        System.out.println("AND: " + (true && false));


        // 5. Logical OR
        System.out.println("OR: " + (false || false));
        System.out.println("OR: " + (false || true));


        // 6. Logical NOT
        System.out.println("NOT: " + (!true));
        System.out.println("NOT: " + (!false));


        // 7. Assignment Operators
        int number = 10;

        number += 5;
        System.out.println("After += : " + number);

        number -= 3;
        System.out.println("After -= : " + number);

        number *= 2;
        System.out.println("After *= : " + number);

        number /= 4;
        System.out.println("After /= : " + number);

        number %= 3;
        System.out.println("After %= : " + number);


        // 8. Unary Operators
        int value = 10;

        System.out.println("Positive: " + (+value));
        System.out.println("Negative: " + (-value));


        // 9. Pre-Increment
        int first = 10;

        System.out.println("Pre-Increment: " + (++first));


        // 10. Post-Increment
        int second = 10;

        System.out.println("Post-Increment: " + (second++));
        System.out.println("After Post-Increment: " + second);


        // 11. Pre-Decrement
        int third = 10;

        System.out.println("Pre-Decrement: " + (--third));


        // 12. Post-Decrement
        int fourth = 10;

        System.out.println("Post-Decrement: " + (fourth--));
        System.out.println("After Post-Decrement: " + fourth);


        // 13. Ternary Operator
        int age = 20;

        String status = age >= 18 ? "Adult" : "Minor";

        System.out.println("Status: " + status);


        // 14. Find Maximum Using Ternary
        int num1 = 10;
        int num2 = 20;

        int max = num1 > num2 ? num1 : num2;

        System.out.println("Maximum: " + max);


        // 15. Bitwise AND
        int bitA = 5;
        int bitB = 3;

        System.out.println("Bitwise AND: " + (bitA & bitB));


        // 16. Bitwise OR
        System.out.println("Bitwise OR: " + (bitA | bitB));


        // 17. Bitwise XOR
        System.out.println("Bitwise XOR: " + (bitA ^ bitB));


        // 18. Bitwise NOT
        int bitValue = 5;

        System.out.println("Bitwise NOT: " + (~bitValue));


        // 19. Left Shift
        int left = 5;

        System.out.println("Left Shift: " + (left << 1));


        // 20. Right Shift
        int right = 8;

        System.out.println("Right Shift: " + (right >> 1));


        // 21. Operator Precedence
        int result1 = 10 + 5 * 2;

        System.out.println("Precedence: " + result1);


        // 22. Parentheses
        int result2 = (10 + 5) * 2;

        System.out.println("Parentheses: " + result2);


        // 23. Combined Expression
        int m = 10;
        int n = 5;

        int result3 = m + n * 2;

        System.out.println("Combined Expression: " + result3);


        // 24. Pre-Increment Dry Run
        int counter1 = 10;

        int answer1 = ++counter1;

        System.out.println("Counter: " + counter1);
        System.out.println("Answer: " + answer1);


        // 25. Post-Increment Dry Run
        int counter2 = 10;

        int answer2 = counter2++;

        System.out.println("Counter: " + counter2);
        System.out.println("Answer: " + answer2);
    }
}