import java.util.*;

public class ListDemo {

    /*** Start writing the missing part ***/
    /* Write populateList((Scanner sc, ArrayList<Integer> al)) */
    static void populateList(Scanner sc, ArrayList<Integer> al) {
        // Input line from keyboard (sc)
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        for (String num : arr) {
            // Create scanner object for the line
            // Grab number and add to array list
            al.add(Integer.parseInt(num));
        }
    }

    /* Write displayList((String title, ArrayList<Integer> al)) */
    static void displayList(String title, ArrayList<Integer> al) {
        // Obtain an Iterator
        Iterator<Integer> itr = al.iterator();
        // Display title
        System.out.print(title + ": ");
        // Check whether next element exists​ and display
        while (itr.hasNext()) {
            int n = itr.next();
            System.out.print(n + " ");
        }
        System.out.print("\n");
    }

    /* Write sortListDesc(ArrayList<Integer> al) for desc. order sorting */
    static void sortListDesc(ArrayList<Integer> al) {
        al.sort(Comparator.reverseOrder());
    }

    /*** End of the missing part ***/

    static int binSearch(ArrayList<Integer> al, int key) {
        int index = Collections.binarySearch(al,
                key, Collections.reverseOrder());
        return index;
    }

    public static void main(String[] args) {
        // Create Scanner objects
        Scanner sc = new Scanner(System.in); // Handle inputs
        int key, index;

        // Create a list of Integers
        ArrayList<Integer> al = new ArrayList<Integer>();

        // Enter few numbers in a line and populate the list
        populateList(sc, al);

        // Display list
        displayList("Original List", al);

        // Sort list in descending order
        sortListDesc(al);

        // Display sorted list
        displayList("Sorted List", al);

        // Input key
        key = sc.nextInt();

        // Perform binary search for key in al
        index = binSearch(al, key);
        if (index >= 0)
            System.out.println("Position: " + index);
        else
            System.out.println("Not found");
    }
}