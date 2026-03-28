//Ashwani Chauhan (2400320100318)//
import java.util.Scanner;

class Student {
    int r;
    String n;
    double m;
    Student(int r, String n, double m) {
        this.r = r;
        this.n = n;
        this.m = m;
    }
    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll No: " + r);
        System.out.println("Name   : " + n);
        System.out.println("Marks  : " + m);
    }
}
public class Students {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        int r = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String n = sc.nextLine();
        System.out.print("Enter Marks: ");
        double m = sc.nextDouble();
        Student s = new Student(r, n, m);
        s.display();
        sc.close();
    }
}