import java.util.LinkedList;
import java.util.Queue;
public class dit12 {
    public static void main(String[] args) {
       //we are creating a queue using an linked list
        Queue<Integer> myqueue= new LinkedList<>();
         myqueue.add(23);
         myqueue.add(44);
         myqueue.add(35);
         myqueue.add(78);
         myqueue.add(98);
         myqueue.add(26);
         System.out.println("elemennts of the queue"+myqueue);
         //we atre acessing the elements of the queue
         int firstElement=myqueue.peek();/*peek function is used here?*/
         System.out.println("The first element of the queue"+firstElement);
         /*removing the element */
         int elementRemoved=myqueue.poll();/*poll is  used  to remove the first element */
         System.out.println("Removed element from ythe queue "+elementRemoved);
         int Removed=98;
         boolean elemeremoved=myqueue.remove(Removed);
        if(elemeremoved){
            System.out.println("removed  "+elemeremoved);

         }else{
            System.out.println(elemeremoved+"element is not found");
         }
         System.out.println("element of the queue after removing the lements:"+myqueue);
        myqueue.clear();
        System.out.println("my "+myqueue);



    }
    
}
