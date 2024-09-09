
/* Import necessary packages */
import java.util.Scanner;
import java.util.Arrays;

/* Declare public Main class */
public class Main {
    /* Declare main() method */
    public static void main(String args[]) {
        /* Create a Scanner object */
        Scanner sc = new Scanner(System.in);
        /* Declare nums array with double elements */
        double nums[] = new double[50];
        int i = 0, size = 0;
        while (sc.hasNextDouble())
            nums[i++] = sc.nextDouble();

        size = i;

        /* You may use Arrays.sort() or your own sorting code */
        Arrays.sort(nums, 0, size);

        /*
         * Display array elements with 2 decimal places using printf();
         * used in earlier assignments
         */
        for (int x = 0; x < size; x++) {
            System.out.printf("%.2f ", nums[x]);
        }
    }
}