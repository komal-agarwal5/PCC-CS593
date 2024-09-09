class Rectangle {
    double length; // Specify data type
    double breadth;

    Rectangle(double l, double b) { // Constructor
        // Assign from parameter 1
        length = l;
        // Assign from parameter 2
        breadth = b;
    }

    double computeArea() { // Compute Area Method
        return (length * breadth);
    }
}