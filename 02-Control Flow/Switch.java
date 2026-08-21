public class Switch {
    public static void main(String[] args) {

        // 1. Basic Switch
        int day1 = 2;

        switch (day1) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid Day");
        }


        // 2. Switch Without Break
        int day2 = 2;

        switch (day2) {
            case 1:
                System.out.println("Monday");

            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");

            default:
                System.out.println("Invalid");
        }


        // 3. Switch With Break
        int day3 = 2;

        switch (day3) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            default:
                System.out.println("Invalid");
        }


        // 4. Default Case
        int day4 = 10;

        switch (day4) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Invalid Day");
        }


        // 5. Multiple Cases With Same Logic
        int day5 = 6;

        switch (day5) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;

            case 6:
            case 7:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Invalid Day");
        }


        // 6. Switch With Char
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Good");
                break;

            case 'C':
                System.out.println("Average");
                break;

            default:
                System.out.println("Invalid Grade");
        }


        // 7. Switch With String
        String dayName = "Monday";

        switch (dayName) {
            case "Monday":
                System.out.println("Start of week");
                break;

            case "Friday":
                System.out.println("Almost weekend");
                break;

            case "Saturday":
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Normal day");
        }


        // 8. Calculator Using Switch
        int a = 20;
        int b = 10;
        char op = '+';

        switch (op) {
            case '+':
                System.out.println("Addition: " + (a + b));
                break;

            case '-':
                System.out.println("Subtraction: " + (a - b));
                break;

            case '*':
                System.out.println("Multiplication: " + (a * b));
                break;

            case '/':
                System.out.println("Division: " + (a / b));
                break;

            case '%':
                System.out.println("Remainder: " + (a % b));
                break;

            default:
                System.out.println("Invalid Operator");
        }


        // 9. Modern Switch
        int day6 = 2;

        switch (day6) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            default -> System.out.println("Invalid");
        }


        // 10. Switch Expression
        int day7 = 2;

        String result1 = switch (day7) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Invalid";
        };

        System.out.println(result1);


        // 11. Multiple Labels
        int day8 = 6;

        String result2 = switch (day8) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> "Invalid";
        };

        System.out.println(result2);


        // 12. Switch With Yield
        int marks = 85;

        String gradeResult = switch (marks / 10) {
            case 10, 9 -> "A+";

            case 8 -> {
                System.out.println("Good Score");
                yield "A";
            }

            case 7 -> "B";

            default -> "C";
        };

        System.out.println(gradeResult);
    }
}