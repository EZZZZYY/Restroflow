package DATA;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

public class tables {
    public static void main(String[] args) {
        try {
            // Get the database connection using the connectionclass
            Connection con = connectionclass.getCon();

            String userTable = "CREATE TABLE user (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(200), username VARCHAR(200), email VARCHAR(200), orgname VARCHAR(200), password VARCHAR(200), repassword VARCHAR(200), status VARCHAR(200), UNIQUE (email))";

            // Create statement using the database connection
            Statement stmt = con.createStatement();
            stmt.executeUpdate(userTable);

            // Close the statement and connection
            stmt.close();
            con.close();

            JOptionPane.showMessageDialog(null, "User Table Created");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}



//            String adminDetails="insert into user(name,username,email,orgname,password,repassword,status) values('admin','admin1','admin@restroflow.com','restroflow','admin','admin','true')";
//            dbop.setDataorDelete(userTable,"Admin details added succesfully");