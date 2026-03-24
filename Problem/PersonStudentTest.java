//Ashwani Chauhan (2400320100318)//
import java.util.Scanner;
class Person {
    String name;
    int age;
    void displayPerson() {
        System.out.println("--- Person Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
class Student extends Person {
    int rollNo;
    String course;
    void displayStudent() {
        System.out.println("--- Student Details ---");
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Course: " + course);
    }
}
public class PersonStudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        s1.name = sc.nextLine();
        System.out.print("Enter Age: ");
        s1.age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Roll Number: ");
        s1.rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Course: ");
        s1.course = sc.nextLine();
        System.out.println("\nDisplaying Information:");
        s1.displayPerson(); 
        s1.displayStudent();
        sc.close();
    }
}


