import java.util.Scanner;

public class Day {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        String dayp = "";
        while (d != 0) {
            switch (d) {
                case 1:
                    dayp = "Monday";
                    break;
                case 2:
                    dayp = "Tuesday";
                    break;
                case 3:
                    dayp = "Wednesday";
                    break;
                case 4:
                    dayp = "Thursday";
                    break;
                case 5:
                    dayp = "Friday";
                    break;
                case 6:
                    dayp = "Saturday";
                    break;
                case 7:
                    dayp = "Sunday";
                    break;
                case 0:
                    dayp = "";
                    break;
                default:
                    dayp = "ERROR";
            }
            System.out.println(dayp);
            d = sc.nextInt();
        }
    }
}