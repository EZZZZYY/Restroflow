package DATA;
import java.sql.*;

public class connectionclass {
    public static Connection getCon(){
        try{
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the database connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/rf?useSSL=false","root","iop123THE");

            return con;
        }
        catch(Exception e){
            return null;
        }
    }
}
