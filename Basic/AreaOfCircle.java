import java.util.Scanner;

    public class AreaOfCircle {
    public static void main(String[] args) {
        System.out.print("Enter the radius of the circle:");
        try (Scanner sc = new Scanner(System.in)) {
            int r = sc.nextInt();
            double area = Math.PI * r * r;
            System.out.println("Area of the circle: " + area);
        }
    }    
    }
