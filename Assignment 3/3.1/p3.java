import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.lang.*;

/* Declare class Shape */
class Shape {
    double area;

    void computeArea() {
    }

    void displayShape() {
    }
}

/* Declare subclass Circle */
class Circle extends Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    @Override()
    void computeArea() {
        super.area = Math.PI * r * r;
    }

    @Override
    void displayShape() {
        System.out.printf("Circle(%.2f) Area: %.2f", r, super.area);
    }
}

/* Declare subclass Rectangle */
class Rectangle extends Shape {
    double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    @Override
    void computeArea() {
        super.area = l * b;
    }

    @Override
    void displayShape() {
        System.out.printf("Rectangle(%.2f,%.2f) Area: %.2f", l, b, super.area);
    }
}

/* Declare subclass Triangle */
class Triangle extends Shape {
    double h, b;

    Triangle(double h, double b) {
        this.h = h;
        this.b = b;
    }

    @Override
    void computeArea() {
        super.area = 0.5 * h * b;
    }

    @Override
    void displayShape() {
        super.area = 0.5 * h * b;
        System.out.printf("Triangle(%.2f,%.2f) Area: %.2f", h, b, super.area);
    }

}

/* Main class */
public class Sheets {
    /* createShape method */
    static Shape createShape(int type, Scanner sin) {
        Shape obj;
        double a, b;

        /* Create specific shape object based on type */
        switch (type) {
            case 1: // Circle
                obj = new Circle(sin.nextDouble());
                obj.computeArea();
                break;

            case 2: // Rectangle
                obj = new Rectangle(sin.nextDouble(), sin.nextDouble());
                obj.computeArea();
                break;

            case 3: // Triangle
                obj = new Triangle(sin.nextDouble(), sin.nextDouble());
                obj.computeArea();
                break;

            default:
                System.out.println("Ignored wrong type");
                obj = null;
                break;
        }

        return obj;
    }

    /* main method */
    public static void main(String args[]) {
        Shape Shapes[] = new Shape[50];
        int n, i = 0, sheetType;
        Shape s;

        /* Create Scanner object */
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            /* Input sheet type (1: Circle, 2: Rectangle, 3: Traiangle) */
            sheetType = sc.nextInt();

            /* Create Shape object */
            s = createShape(sheetType, sc);

            /* Populate Shapes array */
            if (s != null)
                Shapes[i++] = s;
        }

        n = i - 1; // No. of sheets

        /* Sort using Arrays.sort() or your own sorting techniques */
        Arrays.sort(Shapes, 0, i, new Comparator<Shape>() {
            @Override
            public int compare(Shape s1, Shape s2) {
                if (s1.area > s2.area)
                    return 1;
                else if (s1.area < s2.area)
                    return -1;
                else
                    return 0;
            }
        });

        /* Display shapes from the array */
        for (int j = 0; j <= n; j++) {
            System.out.print(j + ": ");
            Shapes[j].displayShape();
            System.out.println();
        }

    } // end of main()

} // end of Sheets class