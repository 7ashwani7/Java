public class Methods {

    // 1. Basic Method
    static void sayHello() {
        System.out.println("Hello Java");
    }


    // 2. Void Method
    static void printMessage() {
        System.out.println("Welcome");
    }


    // 3. Method With Calculation
    static void printSum() {
        int a = 10;
        int b = 20;

        System.out.println(a + b);
    }


    // 4. Method Returning int
    static int getNumber() {
        return 10;
    }


    // 5. Method Returning Sum
    static int sum() {
        int a = 10;
        int b = 20;

        return a + b;
    }


    // 6. Method Returning double
    static double getPi() {
        return 3.14159;
    }


    // 7. Method Returning String
    static String getName() {
        return "Ashwani";
    }


    // 8. Method Returning boolean
    static boolean isEvenNumber() {
        int n = 10;

        return n % 2 == 0;
    }


    // 9. Method With Local Variable
    static void localVariableExample() {
        int x = 100;

        System.out.println("Local Variable: " + x);
    }


    // 10. Return From Void Method
    static void checkPositive(int n) {

        if (n < 0) {
            return;
        }

        System.out.println("Positive number");
    }


    // 11. Multiple Return Paths
    static String checkNumber(int n) {

        if (n > 0) {
            return "Positive";
        }

        if (n < 0) {
            return "Negative";
        }

        return "Zero";
    }


    // 12. Find Maximum
    static int max(int a, int b) {

        if (a > b) {
            return a;
        }

        return b;
    }


    // 13. Find Minimum
    static int min(int a, int b) {

        if (a < b) {
            return a;
        }

        return b;
    }


    // 14. Check Even
    static boolean isEven(int n) {
        return n % 2 == 0;
    }


    // 15. Factorial
    static long factorial(int n) {

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }


    // 16. Reverse Number
    static int reverse(int n) {

        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        return reverse;
    }


    // 17. Palindrome Number
    static boolean isPalindrome(int n) {

        int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        return original == reverse;
    }


    public static void main(String[] args) {

        // 18. Calling Basic Method
        sayHello();


        // 19. Calling Void Method
        printMessage();


        // 20. Calling Calculation Method
        printSum();


        // 21. Calling int Method
        int number = getNumber();

        System.out.println("Number: " + number);


        // 22. Calling Sum Method
        int result = sum();

        System.out.println("Sum: " + result);


        // 23. Calling double Method
        double pi = getPi();

        System.out.println("Pi: " + pi);


        // 24. Calling String Method
        String name = getName();

        System.out.println("Name: " + name);


        // 25. Calling boolean Method
        boolean evenResult = isEvenNumber();

        System.out.println("Even: " + evenResult);


        // 26. Local Variable Example
        localVariableExample();


        // 27. Return From Void Method
        checkPositive(10);


        // 28. Multiple Return Paths
        System.out.println(checkNumber(25));
        System.out.println(checkNumber(-10));
        System.out.println(checkNumber(0));


        // 29. Maximum Method
        System.out.println("Maximum: " + max(10, 20));


        // 30. Minimum Method
        System.out.println("Minimum: " + min(10, 20));


        // 31. Even Check Method
        System.out.println("Is Even: " + isEven(15));


        // 32. Factorial Method
        System.out.println("Factorial: " + factorial(5));


        // 33. Reverse Method
        System.out.println("Reverse: " + reverse(1234));


        // 34. Palindrome Method
        System.out.println("Palindrome: " + isPalindrome(121));
    }
}