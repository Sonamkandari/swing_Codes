
import java.util.DuplicateFormatFlagsException;
import java.util.Scanner;
public class dit5 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter the number inputs");
            int n=sc.nextInt();
            System.out.println("enter the number");
            
            int []arr=new int[n];
            
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                
                try{
                    if(arr[i]!=arr[i+1]){
                        System.out.println("the array does not have dublicate elements");
                    }
        
                 } catch(DuplicateNumberException e){
                    System.out.println("there is dublicate in the "+e.getMessage());

                 }     
            }
            // System.out.println("print array:");
            //     for(int i=0;i<n;i++){
        
            //       System.out.println(arr[i]);
            //     }
         
            



        }
        
        
    }
 }

    

