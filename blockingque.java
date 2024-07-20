import java.util.concurrent.* ; 
import java.util.Iterator;
 import java.util.concurrent.ArrayBlockingQueue ; 
public class blockingque {  
    public static void main( String[ ] args ) {  
      BlockingQueue< String > alph = new ArrayBlockingQueue< >( 7 ) ;  
      try { alph.put( " A " ) ;
        alph.put( " B " ) ;  	       
        alph.put( " C " ) ;  
        alph.put( " D " ) ;  	       
        alph.put( " E " ) ;  	    
        alph.put( " F " ) ;  
        alph.put( " G " ) ;  
        System.out.println( " Content of BLockingQueue : " + alph ) ;  
        String temp = alph.take( ) ;   
        System.out.println( " The number removed is : " + temp ) ;  
        System.out.println( " Content of BLockingQueue after deleting one element : " + alph ) ;  
     } 
      
      catch( Exception e ) {    

          }  

       BlockingQueue< String > vlphi = new LinkedBlockingDeque< String >( ) ;  
        // adding alphabets to the Blocking Queue using add( ) method  
         vlphi.add( " A " ) ; 
        vlphi.add( " B " ) ;  	   
        vlphi.add( " C " ) ;  


       if ( vlphi.contains( " C " ) )  
            System.out.println(  
                " Yayy! Element C successfully founded in the queue " ) ;  
        else  
            System.out.println( " No such element exists in the queue. " ) ;  
    
// Accessing the first element of the queue using the function element( )   
  String top = vlphi.element( ) ;  
     System.out.println( " The top element of the queue is : " + top ) ;  
vlphi.remove( " C " ) ;       
vlphi.remove( " E " ) ;  
// Create an iterator to traverse through the BlockingQueue  
        Iterator< String > alphIter = vlphi.iterator( ) ;  
        // Print the elements of lbdq on to the console  
        System.out.println( " The content of the Linked Blocking Deque is : " ) ;           
        for( int i = 0 ; i < vlphi.size( ) ; i++ )  
        {  
            System.out.print( alphIter.next( ) + " ") ;  
        }         
    }  

}

