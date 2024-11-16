
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;  
public class conn {
    Connection C;
    Statement S;

    public conn() { 
        try {  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            // create a connection
            C= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem", "root", "WEARE11");    
            S = C.createStatement();
        } catch(Exception e) { 
            System.out.println(e);
        }  
    }  
}

