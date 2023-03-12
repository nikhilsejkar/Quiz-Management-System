package Project;
import java.sql.*;
public class ConnectionProvider {
    public static Connection getcon(){
    
    try{
        Class.forName("com.mysql.cj.jdbc.Driver"); //forname load driver class
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javaproject","root",""); //create connection obj
        return con;
    }catch(Exception e){
        
        return null;
         }
    
    
    }
    
}
