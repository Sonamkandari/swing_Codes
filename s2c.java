import java.util.*;
import java.util.LinkedList;
public class s2c {
    public static void main(String[] args) {
        LinkedList<Object>list1=new LinkedList<>();
        list1.add("sonam");
        /*We can directly insert an element in a specific position */
        list1.add(1,"PUFFEN");
        //inserting element at first and last position of linked lsit
        list1.addFirst("Ram");
        list1.addLast("Rohan");
        System.out.println(list1);

        /*iterating linked list in a simple */
        System.out.println("iterating linked list in reverse order");
        for(int i=list1.size()-1;i>=0;i--){
            System.out.println(list1.get(i));
        }

        /*removing a element from a specific position */
        list1.remove(1);
         String lastElement = (String) list1.getLast();
         Object firstElement = list1.removeFirst();
         boolean exists = list1.contains("Element2");
         list1.set(0, "Doremon");
         boolean isEmpty = list1.isEmpty();

         System.out.println("Updated linked list:");
         for (Object element : list1) {
             System.out.println(element);
         }
 
         // Output additional information
         System.out.println("Last Element: " + lastElement);
         System.out.println("Removed First Element: " + firstElement);
         System.out.println("Element 'Element2' exists: " + exists);
         System.out.println("Is LinkedList empty: " + isEmpty);
         System.out.println(list1);
     }

    }

    

