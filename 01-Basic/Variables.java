public class Variables {
    public static void main(String[] args) {

        // 1. Variable Declaration
        int age;
        age = 20;

        System.out.println("Age: " + age);


        // 2. Declaration + Initialization
        int marks = 90;

        System.out.println("Marks: " + marks);


        // 3. Changing / Reassigning a Variable
        age = 21;

        System.out.println("New Age: " + age);


        // 4. Multiple Variables
        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);


        // 5. String Variable
        String name = "Ashwani";

        System.out.println("Name: " + name);


        // 6. Combining String + Variables
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);


        // 7. Variables in Expressions
        int x = 10;
        int y = 20;

        int sum = x + y;

        System.out.println("Sum: " + sum);


        // 8. Reassignment
        int number = 10;

        number = 20;
        number = 30;

        System.out.println("Number: " + number);


        // 9. Multiple Variables in One Line
        int p = 10, q = 20, r = 30;

        System.out.println("p: " + p);
        System.out.println("q: " + q);
        System.out.println("r: " + r);


        // 10. final Variable
        final int DAYS = 7;

        System.out.println("Days: " + DAYS);

        // DAYS = 10;   // ERROR: cannot change final variable


        // 11. Calculation Example
        int num1 = 25;
        int num2 = 15;

        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);


        // 12. Reassignment Dry Run
        int value = 10;

        value = 20;
        value = value + 5;

        System.out.println("Value: " + value);


        // 13. Copying a Variable
        int first = 10;
        int second = first;

        first = 50;

        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }
}

