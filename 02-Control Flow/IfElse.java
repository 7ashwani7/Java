public class IfElse {
    public static void main(String[] args) {

        // 1. Basic If
        int age = 20;

        if (age >= 18) {
            System.out.println("Adult");
        }


        // 2. False If Condition
        int age2 = 15;

        if (age2 >= 18) {
            System.out.println("Adult");
        }


        // 3. If Else
        int age3 = 15;

        if (age3 >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }


        // 4. Even or Odd
        int n1 = 10;

        if (n1 % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }


        // 5. Positive Negative or Zero
        int n2 = -5;

        if (n2 > 0) {
            System.out.println("Positive");
        } else if (n2 < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }


        // 6. Else If
        int marks1 = 85;

        if (marks1 >= 90) {
            System.out.println("A+");
        } else if (marks1 >= 80) {
            System.out.println("A");
        } else if (marks1 >= 70) {
            System.out.println("B");
        } else if (marks1 >= 60) {
            System.out.println("C");
        } else {
            System.out.println("Fail");
        }


        // 7. Logical AND
        int age4 = 25;
        boolean hasLicense = true;

        if (age4 >= 18 && hasLicense) {
            System.out.println("Can drive");
        } else {
            System.out.println("Cannot drive");
        }


        // 8. Logical OR
        int day = 6;

        if (day == 6 || day == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Weekday");
        }


        // 9. Nested If
        int age5 = 20;
        boolean citizen = true;

        if (age5 >= 18) {

            if (citizen) {
                System.out.println("Eligible to vote");
            }
        }


        // 10. Nested If Else
        int age6 = 16;
        boolean citizen2 = true;

        if (age6 >= 18) {

            if (citizen2) {
                System.out.println("Eligible");
            } else {
                System.out.println("Not a citizen");
            }

        } else {
            System.out.println("Underage");
        }


        // 11. Maximum of Two Numbers
        int a = 10;
        int b = 20;

        if (a > b) {
            System.out.println("a is greater");
        } else {
            System.out.println("b is greater");
        }


        // 12. Maximum of Three Numbers
        int x = 10;
        int y = 30;
        int z = 20;

        if (x >= y && x >= z) {
            System.out.println("x is maximum");
        } else if (y >= x && y >= z) {
            System.out.println("y is maximum");
        } else {
            System.out.println("z is maximum");
        }


        // 13. Voting Eligibility
        int age7 = 20;

        if (age7 >= 18) {
            System.out.println("Eligible to vote");
        } else {
            System.out.println("Not eligible to vote");
        }


        // 14. Pass or Fail
        int marks2 = 45;

        if (marks2 >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }


        // 15. Grade Calculation
        int marks3 = 72;

        if (marks3 >= 90) {
            System.out.println("A+");
        } else if (marks3 >= 80) {
            System.out.println("A");
        } else if (marks3 >= 70) {
            System.out.println("B");
        } else if (marks3 >= 60) {
            System.out.println("C");
        } else if (marks3 >= 40) {
            System.out.println("D");
        } else {
            System.out.println("Fail");
        }
    }
}