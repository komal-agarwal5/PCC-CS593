
/* Import libraries */
import java.util.*;

/* Declare public class SimpleStack with main() method */
public class SimpleStack {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[5];
        GenSimpleStack<String> st = new GenSimpleStack<String>(arr);
        int ch;
        while (sc.hasNext()) {
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    try {
                        st.push(sc.next());
                    } catch (StackFullException ex) {
                        System.out.print(ex + " ");
                    }
                    break;
                case 2:
                    try {
                        System.out.print(st.pop() + " ");
                    } catch (StackEmptyException ex) {
                        System.out.print(ex + " ");
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Invalid");
            }
        }
    }
}

/* Declare interfce IGenSimpleStack<T> */
interface IGenSimpleStack<T> {
    public void push(T obj) throws StackFullException;

    public T pop() throws StackEmptyException;

    public boolean isEmpty();

    public boolean isFull();
}

/* Declare GenSimpleStack<T> implementing interface IGenSimpleStack */
class GenSimpleStack<T> implements IGenSimpleStack<T> {
    T arr[];
    int top;

    GenSimpleStack(T data[]) {
        arr = data;
        top = 0;
    }

    public void push(T obj) throws StackFullException {
        if (isFull())
            throw new StackFullException(arr.length);
        arr[top++] = obj;
    }

    public T pop() throws StackEmptyException {
        if (isEmpty())
            throw new StackEmptyException(arr.length);
        return arr[--top];
    }

    public boolean isEmpty() {
        return (top == 0);
    }

    public boolean isFull() {
        return (top == arr.length);
    }
}

/* Declare StackFullException class */
class StackFullException extends Exception {
    int size;

    StackFullException(int size) {
        super("[Full-" + size + "]");
        this.size = size;
    }

    public String toString() {
        return "[Full-" + size + "]";
    }
}

/* Declare StackEmptyException class */
class StackEmptyException extends Exception {
    int size;

    StackEmptyException(int size) {
        super("[Empty-" + size + "]");
        this.size = size;
    }

    public String toString() {
        return "[Empty]";
    }
}