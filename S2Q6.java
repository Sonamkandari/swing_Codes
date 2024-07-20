import java.util.TreeMap;
import java.util.Set;

public class S2Q6 {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> treeMap1 = new TreeMap<>();

        // a. To associate the specified value with the specified key in a TreeMap
        treeMap1.put(1, "Apple");
        treeMap1.put(2, "Bunny");
        treeMap1.put(3, "Cake");

        // b. To copy TreeMap's content to another TreeMap
        TreeMap<Integer, String> treeMap2 = new TreeMap<>(treeMap1);
        System.out.println("TreeMap2: " + treeMap2);

        // c. To search for a key in a TreeMap
        int searchKey = 2;
        if (treeMap1.containsKey(searchKey)) {
            System.out.println("Key " + searchKey + " found in TreeMap1.");
        } else {
            System.out.println("Key " + searchKey + " not found in TreeMap1.");
        }

        // d. To search for a value in a TreeMap
        String searchValue = "Bunny";
        if (treeMap1.containsValue(searchValue)) {
            System.out.println("Value " + searchValue + " found in TreeMap1.");
        } else {
            System.out.println("Value " + searchValue + " not found in TreeMap1.");
        }

        // e. To get all keys from a TreeMap
        Set<Integer> keys = treeMap1.keySet();
        System.out.println("Keys in TreeMap1: " + keys);

        // f. To delete all elements from a TreeMap
        treeMap1.clear();
        System.out.println("TreeMap1 after clearing: " + treeMap1);

        // g. To get the first (lowest) key and the last (highest) key currently in a map
        int firstKey = treeMap2.firstKey();
        int lastKey = treeMap2.lastKey();
        System.out.println("First Key: " + firstKey);
        System.out.println("Last Key: " + lastKey);
    }
}
