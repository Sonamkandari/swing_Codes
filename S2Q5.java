import java.util.HashMap;
import java.util.Map;
import java.util.Collection;

public class S2Q5 {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> hashMap1 = new HashMap<>();

        // a. To associate the specified value with the specified key in a HashMap
        hashMap1.put(1, "sonam");
        hashMap1.put(2, "Ram");
        hashMap1.put(3, "Annu");

        // b. To count the number of key-value (size) mappings in a map
        System.out.println("Size of HashMap: " + hashMap1.size());

        // c. To copy all mappings from the specified map to another map
        HashMap<Integer, String> hashMap2 = new HashMap<>();
        hashMap2.putAll(hashMap1);
        System.out.println("HashMap2: " + hashMap2);

        // d. To remove all mappings from a map
        hashMap1.clear();
        System.out.println("HashMap1 after clearing: " + hashMap1);

        // e. To check whether a map contains key-value mappings (empty) or not
        System.out.println("Is HashMap1 empty? " + hashMap1.isEmpty());

        // f. To get a collection view of the values contained in this map
        Collection<String> values = hashMap2.values();
        System.out.println("Values in HashMap2: " + values);
    }
}
