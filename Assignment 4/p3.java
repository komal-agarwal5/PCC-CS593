import java.util.*;

public class Program3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, num, sum;
        sum = 0;
        try {
            n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                num = sc.nextInt();
                sum += num;
            }
            System.out.println(sum);
        } catch (InputMismatchException e) {
            System.out.println("ERROR");
        }
    }
}