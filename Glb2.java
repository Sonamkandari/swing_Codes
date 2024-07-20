import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Glb2 extends JFrame {
    private JTextArea textArea;

    public Glb2() {
        // Set up the GUI
        setTitle("Map Demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(400, 300));
        setLayout(new BorderLayout());

        textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        // HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("key1", 1);
        hashMap.put("key2", 2);
        hashMap.put("key3", 3);

        int hashMapSize = hashMap.size();
        textArea.append("HashMap size: " + hashMapSize + "\n");

 
        Map<String, Integer> copyMap = new HashMap<>(hashMap); // Create a shallow copy

        // Removing all mappings from a map
        hashMap.clear();
        textArea.append("HashMap after clear: " + hashMap.isEmpty() + "\n");

        boolean isEmpty = hashMap.isEmpty();
        textArea.append("HashMap is empty: " + isEmpty + "\n");

    
        Set<Integer> values = new LinkedHashSet<>(copyMap.values());
        textArea.append("Values in LinkedHashMap: " + values + "\n");

      
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("key1", 1);
        linkedHashMap.put("key2", 2);
        linkedHashMap.put("key3", 3);

       
        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("key3", 3);
        treeMap.put("key1", 1);
        treeMap.put("key2", 2);

        // Perform the same operations for LinkedHashMap and TreeMap as done for HashMap
        // ...

        // Display the GUI
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Glb2::new);
    }
}