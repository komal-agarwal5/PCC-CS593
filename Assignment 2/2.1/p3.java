import java.util.Scanner;

class Course {
    String code;
    String name;

    /* Name of constructor is same as class name */
    Course(String c, String n) { // Parametrized construictor
        code = c;
        name = n;
    }

    Course() { // Also provide Non-parametrized constructor
        code = "";
        name = "";
    }

    String getCourse() { // get accessor method
        return (code + " | " + name);
    }

    void setCourse(String c, String n) { // set accessor method
        code = c;
        name = n;
    }
}