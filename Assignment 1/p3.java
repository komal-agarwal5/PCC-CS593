import java.util.Scanner;

public class ComputeAverage {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int marks = 0, sum = 0;
        for (int i = 1; i <= 5; i++) {
            marks = sc.nextInt(); /* Input marks */
            sum += marks;
            /* Calculate sum */
        }
        double avg = sum / 5.0;
        System.out.printf("%.2f\n", avg);
    }
}