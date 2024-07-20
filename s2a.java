import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class s2a {
    public static void main(String[] args) {
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("sonam");
        l1.add("Ri");
        l1.add("aditya");
        l1.add("aman");
        l1.add("suraj");

        l1.add(2, "Tamanna");

        String elementAtIndex2 = l1.get(2);
        System.out.println("Element at index 2: " + elementAtIndex2);
        l1.set(3, "Strawberry");
        l1.remove(4);

        String searchElement = "";
        int index = l1.indexOf(searchElement);
        if (index != -1) {
            System.out.println(searchElement + " found at index: " + index);
        } else {
            System.out.println(searchElement + " not found in the l1");
        }
        
        Collections.sort(l1);
        System.out.println(l1);
        System.out.println("Iterating through all elements of ArrayList:");
        Iterator<String> iterator = l1.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());


       
        }
}
}

