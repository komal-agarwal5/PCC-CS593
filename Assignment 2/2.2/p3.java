// Declare createShape method
// static as it is called from static main method
static Shape createShape(int type, Scanner sin) {
    Shape obj;

    // Create specific shape object based on type value
    // 1: Circle
    // 2: Rectangle
    // 3: Triangle

    switch (type) {
        case 1: // Circle
            // Display "Circle detected"
            System.out.println("Circle detected");
            // Create Circle object
            Circle c = new Circle(sin.nextDouble());
            c.computeArea();
            obj = c;
            break;

        case 2: // Rectangle
            // Display "Rectangle detected"
            System.out.println("Rectangle detected");
            Rectangle r = new Rectangle(sin.nextDouble(), sin.nextDouble());
            r.computeArea();
            obj = r;
            break;

        case 3: // Triangle
            // Display "Triangle detected"
            System.out.println("Triangle detected");
            Triangle t = new Triangle(sin.nextDouble(), sin.nextDouble());
            t.computeArea();
            obj = t;
            break;

        default:
            System.out.printf("Ignoring wrong type: %d\n", type);
            // Set obj to null
            obj = null;
            break;
    }

    return obj;
}
