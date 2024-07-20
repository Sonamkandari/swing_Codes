import java.util.LinkedList;

public class S2Q3 {
    public static void main(String[] args) {
        // Declare and initialize a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();

        // a. Insert the specified element at the specified position
        linkedList.add(0, "Sonam");
        linkedList.add(1, "Akku");
        linkedList.add(2, "GAutam");

        // b. Insert specified element at the specified position
        linkedList.add(1, "Doremon");

        // c. Insert specified element at First and Last position
        linkedList.addFirst("Rose");
        linkedList.addLast("apple");

        // d. Iterate a linked list in reverse order
        System.out.println("LinkedList elements in reverse order:");
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            System.out.println(linkedList.get(i));
        }

        // e. Remove a specified element from a linked list
        linkedList.remove("Rose");

        // f. Retrieve, but not remove, the last element of a linked list
        System.out.println("Last element of LinkedList: " + linkedList.getLast());

        // g. Remove and return the first element of a linked list
        String firstElement = linkedList.removeFirst();
        System.out.println("Removed first element of LinkedList: " + firstElement);

        // h. Check if a particular element exists in a linked list
        String searchElement = "sonam";
        boolean found = false;
        for (String element : linkedList) {
            if (element.equals(searchElement)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println(searchElement + " exists in the LinkedList.");
        } else {
            System.out.println(searchElement + " does not exist in the LinkedList.");
        }

        // i. Replace an element in a linked list
        linkedList.set(2, "Watermelon");

        // j. Check if a linked list is empty or not
        if (linkedList.isEmpty()) {
            System.out.println("LinkedList is empty.");
        } else {
            System.out.println("LinkedList is not empty.");
        }
    }
}
