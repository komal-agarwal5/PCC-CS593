
/* Import libraries */
import java.util.*;

/* Declare public class SimpleStack with main() method */
public class SimpleStack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[5];
        GenSimpleStack<String> st = new GenSimpleStack<String>(arr);
        while (sc.hasNext()) {
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    try {
                        String item = sc.next();
                        st.push(item);
                    } catch (StackFullException exc) {
                        System.out.print(exc);
                    }
                    break;
                case 2:
                    try {
                        System.out.print(st.pop() + " ");
                    } catch (StackEmptyException exc) {
                        System.out.print(exc);
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("INVALID");
            }
        }
    }
}

/* Declare interfce IGenSimpleStack<T> */
interface IGenSimpleStack<T> {
    public void push(T a) throws StackFullException;

    public T pop() throws StackEmptyException;

    public boolean isFull();

    public boolean isEmpty();
}

/* Declare GenSimpleStack<T> implementing interface IGenSimpleStack */
class GenSimpleStack<T> implements IGenSimpleStack<T> {
    private T arr[];
    private int top;

    GenSimpleStack(T dt[]) {
        arr = dt;
        top = 0;
    }

    public void push(T a) throws StackFullException {
        if (isFull())
            throw new StackFullException(arr.length);
        arr[top++] = a;
    }

    public T pop() throws StackEmptyException {
        if (isEmpty())
            throw new StackEmptyException(arr.length);
        return arr[--top];
    }

    public boolean isFull() {
        return top == arr.length;
    }

    public boolean isEmpty() {
        return top == 0;
    }
}

/* Declare StackFullException class */
class StackFullException extends Exception {
    int size;

    StackFullException(int size) {
        super("[Full-5] ");
        this.size = size;
    }

    public String toString() {
        return "[Full-5] ";
    }
}

/* Declare StackEmptyException class */
class StackEmptyException extends Exception {
    int size;

    StackEmptyException(int size) {
        super("[Empty] ");
        this.size = size;
    }

    public String toString() {
        return "[Empty] ";
    }
}