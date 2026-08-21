public class ConditionalOperator {
    public static void main(String[] args) {

        // 1. Basic Ternary Operator
        int age = 20;

        String result1 = age >= 18 ? "Adult" : "Minor";

        System.out.println(result1);


        // 2. Maximum of Two Numbers
        int a = 10;
        int b = 20;

        int max = a > b ? a : b;

        System.out.println("Maximum: " + max);


        // 3. Minimum of Two Numbers
        int min = a < b ? a : b;

        System.out.println("Minimum: " + min);


        // 4. Even or Odd
        int n1 = 7;

        String result2 = n1 % 2 == 0 ? "Even" : "Odd";

        System.out.println(result2);


        // 5. Positive or Negative
        int n2 = -10;

        String result3 = n2 >= 0 ? "Positive" : "Negative";

        System.out.println(result3);


        // 6. Positive Negative or Zero
        int n3 = -10;

        String result4 = n3 > 0
                ? "Positive"
                : n3 < 0
                ? "Negative"
                : "Zero";

        System.out.println(result4);


        // 7. Maximum of Three Numbers
        int x = 10;
        int y = 30;
        int z = 20;

        int max3 = x > y ? (x > z ? x : z) : (y > z ? y : z);

        System.out.println("Maximum of Three: " + max3);


        // 8. Pass or Fail
        int marks1 = 75;

        String result5 = marks1 >= 40 ? "Pass" : "Fail";

        System.out.println(result5);


        // 9. Conditional Value
        int fee = age >= 18 ? 100 : 50;

        System.out.println("Fee: " + fee);


        // 10. Boolean Result
        int n4 = 10;

        boolean even = n4 % 2 == 0 ? true : false;

        System.out.println("Even: " + even);


        // 11. Simplified Boolean Result
        boolean even2 = n4 % 2 == 0;

        System.out.println("Even: " + even2);


        // 12. Absolute Value
        int n5 = -25;

        int absolute = n5 >= 0 ? n5 : -n5;

        System.out.println("Absolute: " + absolute);


        // 13. Divisibility Check
        int n6 = 15;

        String result6 = n6 % 5 == 0 ? "Divisible" : "Not Divisible";

        System.out.println(result6);


        // 14. Voting Eligibility
        int age2 = 17;

        String result7 = age2 >= 18 ? "Eligible" : "Not Eligible";

        System.out.println(result7);


        // 15. Grade Using Nested Ternary
        int marks2 = 85;

        String grade = marks2 >= 90
                ? "A+"
                : marks2 >= 80
                ? "A"
                : marks2 >= 70
                ? "B"
                : marks2 >= 60
                ? "C"
                : marks2 >= 40
                ? "D"
                : "Fail";

        System.out.println("Grade: " + grade);


        // 16. Ternary Inside Print
        int n7 = 10;

        System.out.println(n7 % 2 == 0 ? "Even" : "Odd");


        // 17. String Condition
        boolean loggedIn = true;

        System.out.println(loggedIn ? "Welcome" : "Please Login");


        // 18. Ternary With Expression
        int p = 10;
        int q = 20;

        int result8 = (p + q) > 25 ? p * 2 : q * 2;

        System.out.println("Result: " + result8);


        // 19. Ternary With Print
        int r = 10;
        int s = 20;

        System.out.println("Maximum: " + (r > s ? r : s));
    }
}