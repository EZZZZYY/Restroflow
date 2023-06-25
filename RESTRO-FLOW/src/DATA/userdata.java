package DATA;

import MODEL.User;
import javax.swing.JOptionPane;
import java.sql.*;



public class userdata {
    public static void save(User user) {
        String query = "INSERT INTO user(name, username, email, orgname, password, repassword, status) " +
                "VALUES ('" + user.getName() + "', '" + user.getUsername() + "', '" + user.getEmail() + "', '" + user.getOrgname() + "', '" + user.getPassword() + "', '" + user.getRepassword() + "', 'false')";
        dbop.setDataorDelete(query,"Registered Successfully ! Waiting for response");

        // Execute the query and perform any necessary database operations
        // ...
    }
        public static User login(String email,String password){
        User user=null;
        try{
            ResultSet rs = dbop.getData("SELECT * FROM user WHERE email='" + email + "' AND password='" + password + "'");
            while(rs.next()){
                user= new User();
                user.setStatus(rs.getString("status"));
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }
        return user;
    }
}
