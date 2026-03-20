//Ashwani Chauhan (2400320100318)//
abstract class Shape {
    abstract void area();
}
class Circle extends Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    @Override
    void area() {
        double result = Math.PI * Math.pow(radius, 2);
        System.out.printf("Circle Area    (r=%.1f) : %.2f%n", radius, result);
    }
}
class Rectangle extends Shape {
    private final double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    void area() {
        double result = length * width;
        System.out.printf("Rectangle Area (%.1fx%.1f) : %.2f%n", length, width, result);
    }
}
public class ClassShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5.0),
            new Rectangle(10.0, 4.0),
            new Circle(2.5)
        };
        System.out.println("--- Calculating Areas Dynamically ---");
        for (Shape s : shapes) {
            s.area();
        }
    }
}