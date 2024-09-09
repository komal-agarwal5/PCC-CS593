import java.util.Scanner;

interface Shape {
    double computeArea();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}

class Rectangle implements Shape {
    private double length, breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double computeArea() {
        double area = length * breadth;
        return area;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        int type;
        Shape s;

        Scanner sc = new Scanner(System.in);

        /* Collect shape dimensions */
        LoopTypes: while (sc.hasNextInt()) {
            type = sc.nextInt();

            /* Input sheet type (1: Circle, 2: Rectangle) */
            switch (type) {
                case 0:
                    System.exit(0);
                case 1:
                    s = new Circle(sc.nextDouble());
                    System.out.printf("Circle: %.2f\n", s.computeArea());
                    break;

                case 2:
                    // Display "Rectangle detected"
                    s = new Rectangle(sc.nextDouble(), sc.nextDouble());
                    System.out.printf("Rectangle: %.2f\n", s.computeArea());
                    break;

                default:
                    System.out.printf("Invalid type\n");

            }
        } /* end of while */
    } /* end of main */
} /* end of Main class */