import java.util.Scanner;

class Shape {

    // Area of Circle
    void area(double radius) {
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + area);
    }

    // Area of Rectangle
    void area(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }

    // Area of Triangle
    void area(float base, float height) {
        double area = 0.5 * base * height;
        System.out.println("Area of Triangle = " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape s = new Shape();

        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        s.area(radius);

        System.out.print("Enter length and breadth of rectangle: ");
        double length = sc.nextDouble();
        double breadth = sc.nextDouble();
        s.area(length, breadth);

        System.out.print("Enter base and height of triangle: ");
        float base = sc.nextFloat();
        float height = sc.nextFloat();
        s.area(base, height);

        sc.close();
    }
}
