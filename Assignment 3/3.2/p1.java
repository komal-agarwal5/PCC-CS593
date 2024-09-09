import java.util.*;

/* Declare Stack class */
class Stack {
    int arr[];
    int top;

    // Constructor
    Stack() {
        arr = new int[50];
        top = -1;
    }

    // isEmpty Method
    public boolean isEmpty() {
        return top == -1 ? true : false;
    }

    // isFull Method
    public boolean isFull() {
        return top == arr.length ? true : false;
    }

    // push method
    public void push(int val) {
        arr[++top] = val;
    }

    // pop method
    public int pop() {
        int val = arr[top--];
        return val;
    }
}

public class Postfix {
    // main method
    public static void main(String args[]) {
        // Read input line
        Scanner sc = new Scanner(System.in);
        String exp = sc.nextLine();
        // Populate an array of tokens
        String post[] = exp.split(" ");
        // Create stack object
        Stack sobj = new Stack();
        // Process array elements in a loop
        for (String token : post) {
            int v1 = 0, v2 = 0, res = 0;
            switch (token) {
                // process for operators
                case "+":
                    if (!sobj.isEmpty())
                        v1 = sobj.pop();
                    if (!sobj.isEmpty())
                        v2 = sobj.pop();
                    res = v1 + v2;
                    sobj.push(res);
                    break;
                case "-":
                    if (!sobj.isEmpty())
                        v1 = sobj.pop();
                    if (!sobj.isEmpty())
                        v2 = sobj.pop();
                    res = v2 - v1;
                    sobj.push(res);
                    break;
                case "*":
                    if (!sobj.isEmpty())
                        v1 = sobj.pop();
                    if (!sobj.isEmpty())
                        v2 = sobj.pop();
                    res = v1 * v2;
                    sobj.push(res);
                    break;
                case "/":
                    if (!sobj.isEmpty())
                        v1 = sobj.pop();
                    if (!sobj.isEmpty())
                        v2 = sobj.pop();
                    res = v2 / v1;
                    sobj.push(res);
                    break;
                default:
                    // process for number
                    sobj.push(Integer.parseInt(token));
            }

            // push result into stack
        }
        // Display result
        System.out.println(sobj.pop());
    }
}