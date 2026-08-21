import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Validate Positive Number
        int number1 = -5;

        if (number1 > 0) {
            System.out.println("Valid positive number");
        } else {
            System.out.println("Invalid number");
        }


        // 2. Validate Age
        int age = 25;

        if (age >= 1 && age <= 120) {
            System.out.println("Valid age");
        } else {
            System.out.println("Invalid age");
        }


        // 3. Validate Marks
        int marks = 85;

        if (marks >= 0 && marks <= 100) {
            System.out.println("Valid marks");
        } else {
            System.out.println("Invalid marks");
        }


        // 4. Validate Marks With Do While
        int marks2;

        do {
            System.out.print("Enter marks (0-100): ");
            marks2 = sc.nextInt();
        } while (marks2 < 0 || marks2 > 100);

        System.out.println("Valid marks: " + marks2);


        // 5. Validate Age With Do While
        int age2;

        do {
            System.out.print("Enter age (1-120): ");
            age2 = sc.nextInt();
        } while (age2 < 1 || age2 > 120);

        System.out.println("Valid age: " + age2);


        // 6. Menu Validation
        int choice;

        do {
            System.out.print("Enter choice (1-3): ");
            choice = sc.nextInt();
        } while (choice < 1 || choice > 3);

        System.out.println("Valid choice: " + choice);


        // 7. Sentinel Value
        int number2;

        do {
            System.out.print("Enter number (-1 to stop): ");
            number2 = sc.nextInt();

            if (number2 != -1) {
                System.out.println("Processing: " + number2);
            }

        } while (number2 != -1);


        // 8. Sum Until Sentinel
        int number3;
        int sum = 0;

        do {
            System.out.print("Enter number (-1 to stop): ");
            number3 = sc.nextInt();

            if (number3 != -1) {
                sum += number3;
            }

        } while (number3 != -1);

        System.out.println("Sum: " + sum);


        // 9. Count Until Sentinel
        int number4;
        int count = 0;

        do {
            System.out.print("Enter number (-1 to stop): ");
            number4 = sc.nextInt();

            if (number4 != -1) {
                count++;
            }

        } while (number4 != -1);

        System.out.println("Count: " + count);


        // 10. Sum Only Positive Values
        int number5;
        int positiveSum = 0;

        do {
            System.out.print("Enter number (-1 to stop): ");
            number5 = sc.nextInt();

            if (number5 > 0) {
                positiveSum += number5;
            }

        } while (number5 != -1);

        System.out.println("Positive Sum: " + positiveSum);


        // 11. Find Maximum Until Sentinel
        int number6;
        int max = Integer.MIN_VALUE;
        boolean found = false;

        do {
            System.out.print("Enter number (-1 to stop): ");
            number6 = sc.nextInt();

            if (number6 != -1) {
                found = true;

                if (number6 > max) {
                    max = number6;
                }
            }

        } while (number6 != -1);

        if (found) {
            System.out.println("Maximum: " + max);
        } else {
            System.out.println("No numbers entered");
        }


        // 12. Validate Even Number
        int number7;

        do {
            System.out.print("Enter an even number: ");
            number7 = sc.nextInt();
        } while (number7 % 2 != 0);

        System.out.println("Valid even number: " + number7);


        // 13. Validate Positive Even Number
        int number8;

        do {
            System.out.print("Enter a positive even number: ");
            number8 = sc.nextInt();
        } while (number8 <= 0 || number8 % 2 != 0);

        System.out.println("Valid number: " + number8);


        // 14. Limited Attempts
        int attempts = 0;
        int correctPassword = 1234;
        int enteredPassword = 0;

        while (attempts < 3) {

            System.out.print("Enter password: ");
            enteredPassword = sc.nextInt();

            attempts++;

            if (enteredPassword == correctPassword) {
                System.out.println("Login successful");
                break;
            }

            System.out.println("Wrong password");
        }


        // 15. Validate Range
        int number9 = 50;

        if (number9 >= 10 && number9 <= 100) {
            System.out.println("Inside range");
        } else {
            System.out.println("Outside range");
        }


        // 16. Validation With Switch
        int choice2 = 2;

        if (choice2 >= 1 && choice2 <= 3) {

            switch (choice2) {
                case 1:
                    System.out.println("Add");
                    break;

                case 2:
                    System.out.println("Subtract");
                    break;

                case 3:
                    System.out.println("Exit");
                    break;
            }

        } else {
            System.out.println("Invalid choice");
        }


        sc.close();
    }
}