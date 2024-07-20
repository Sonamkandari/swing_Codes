import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class S2Q1 {
    public static void main(String[] args) {
        // Declare and initialize an ArrayList of String type
        ArrayList<String> arrayList = new ArrayList<>();

        // a. Insert 5 Elements of string type
        arrayList.add("Sonam");
        arrayList.add("Ri");
        arrayList.add("Bunny");
        arrayList.add("OG");
        arrayList.add("Gairo");

        // b. Insert Element at a specific Index
        arrayList.add(2, "Nobi");

        // c. Retrieve an element (at a specified index) from a given array list
        System.out.println("Element at index 3: " + arrayList.get(3));

        // d. Update an array element by the given element
        arrayList.set(4, "Pranjal");

        // e. Delete Element at a specific Index
        arrayList.remove(1);

        // f. Search for an element in an array list
        String searchElement = "Grapes";
        if (arrayList.contains(searchElement)) {
            System.out.println(searchElement + " found in the ArrayList.");
        } else {
            System.out.println(searchElement + " not found in the ArrayList.");
        }

        // g. Sort the array list
        Collections.sort(arrayList);

        // h. Reverse elements in an array list
        Collections.reverse(arrayList);

        // i. Iterate through all the elements of an ArrayList
        System.out.println("ArrayList elements:");
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
