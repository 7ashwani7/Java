import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 1. Integer Input
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.println("Age: " + age);


        // 2. Long Input
        System.out.print("Enter population: ");
        long population = sc.nextLong();

        System.out.println("Population: " + population);


        // 3. Double Input
        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.println("Price: " + price);


        // 4. Float Input
        System.out.print("Enter percentage: ");
        float percentage = sc.nextFloat();

        System.out.println("Percentage: " + percentage);


        // 5. One Word Input
        System.out.print("Enter first name: ");
        String firstName = sc.next();

        System.out.println("First Name: " + firstName);


        // 6. Character Input
        System.out.print("Enter grade: ");
        char grade = sc.next().charAt(0);

        System.out.println("Grade: " + grade);


        // 7. Boolean Input
        System.out.print("Are you passed? ");
        boolean passed = sc.nextBoolean();

        System.out.println("Passed: " + passed);


        // 8. Clearing the Newline
        sc.nextLine();


        // 9. Full Line Input
        System.out.print("Enter full name: ");
        String fullName = sc.nextLine();

        System.out.println("Full Name: " + fullName);


        // 10. Multiple Integer Inputs
        System.out.print("Enter two numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Sum: " + (a + b));


        // 11. Integer and Double Input
        System.out.print("Enter marks and percentage: ");

        int marks = sc.nextInt();
        double result = sc.nextDouble();

        System.out.println("Marks: " + marks);
        System.out.println("Percentage: " + result);


        // 12. Scanner Close
        sc.close();
    }
}