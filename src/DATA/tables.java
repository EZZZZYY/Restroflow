package DATA;

import javax.swing.JOptionPane;

public class tables {

    public static void main(String[] args) {
        try {
//            String userTable = "CREATE TABLE user (id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(200), username VARCHAR(200), email VARCHAR(200), password VARCHAR(200), repassword VARCHAR(200), status VARCHAR(200), UNIQUE (email))";
//            String adminDetails = "insert into user(name,username,email,orgname,password,repassword,status) values('admin','admin1','admin@restroflow.com','restroflow','admin','admin','true')";
//            dbop.setDataorDelete(adminDetails, "Admin details added succesfully");
//            String categoryTable = "CREATE TABLE category(id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(200))";
//            dbop.setDataorDelete(categoryTable, "Category Table Created");
//            dbop.setDataorDelete(userTable, "User Table Created");
            String productTable="CREATE TABLE product(id INT AUTO_INCREMENT PRIMARY KEY,name varchar(500),category varchar(500),price varchar(500))";
            dbop.setDataorDelete(productTable, "Product Table Created");
            String placeorder = "CREATE TABLE bill(id INT PRIMARY KEY, name VARCHAR(200),mobileNumber VARCHAR(200),address VARCHAR(200),date VARCHAR(200),total VARCHAR(200),createdBy VARCHAR(200))";
            dbop.setDataorDelete(placeorder, "PLACE ORDER TABLE CREATED");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
