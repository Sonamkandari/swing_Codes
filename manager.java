import java.util.ArrayList;
import java.util.Collections;

public class manager {
    public static void main(String[] args) {
        // Creating two ArrayLists of String
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();

        // Adding elements to the first ArrayList
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");

        // Adding elements to the second ArrayList
        list2.add("Mango");
        list2.add("Grapes");
        list2.add("Pineapple");

        // (i) Comparing two ArrayLists
        System.out.println("Comparing two ArrayLists:");
        if (list1.equals(list2)) {
            System.out.println("ArrayLists are equal.");
        } else {
            System.out.println("ArrayLists are not equal.");
        }

        // (ii) Joining two ArrayLists
        ArrayList<String> joinedList = new ArrayList<>(list1);
        joinedList.addAll(list2);
        System.out.println("\nJoined ArrayList:");
        System.out.println(joinedList);

        // (iii) Swapping two elements in an ArrayList
        Collections.swap(list1, 0, 2); // Swapping first and third elements
        System.out.println("\nAfter swapping first and third elements:");
        System.out.println(list1);

        // (iv) Retrieving an element from an ArrayList
        String element = list2.get(1); // Retrieving element at index 1
        System.out.println("\nRetrieved element from list2 at index 1: " + element);
    }
}
