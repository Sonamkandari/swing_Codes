import java .util.*;
import java.util.Collections;
import java.util.ArrayList;

public class tom{
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<String>();

        arr.add("Apple");
        arr.add("Mango");
        arr.add("Banana");
        arr.add("Kiwi");
        arr.add("Grape");

        //System.out.println(arr);

        arr.add(2,"Orange");
        //System.out.println(arr);

        String retrivedElement=arr.get(3);
        //System.out.println("At index 3 there is : " +retrivedElement);

        arr.set(4,"Papaya");
        //System.out.println(arr);

        arr.remove(2);
        //System.out.println(arr);

        String searchString = "Mango";
        int index = arr.indexOf(searchString);
    if (index != -1) {
    System.out.println(searchString + " found at index " + index);
} else {
    System.out.println(searchString + " not found");
}
    Collections.sort(arr);
    //System.out.println(arr);

    Collections.reverse(arr);
    //System.out.println(arr);

    System.out.println("Printing the array list:");
    Iterator<String> iterator=arr.iterator();
    {
        while(iterator.hasNext())
        System.out.println(iterator.next());

    }
}   
}