/* Method overloading feature allows a class to have more than one method with the same name, provided that the parameter list is different. 

In this example, method overloading is applied for square() method. If main() calls square() with int parameter, square(int) method will be triggreed, whereas square(double) will be triggered when square() called with double parameter. */

/* Declare class MethodOverload */
class MethodOverload {
    // Declare square method for returning area in integer
    public int square(int s) {
        return s * s;
        // return area in int
    }

    // Declare square method for returning area in double
    public double square(double s) {
        return s * s;
        // return area in double
    }
}