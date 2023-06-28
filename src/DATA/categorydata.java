/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DATA;

import MODEL.Category;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author user
 */
public class categorydata {

    public static void save(Category category) {
        String query = "INSERT INTO category(name) values('" + category.getName() + "')";
        dbop.setDataorDelete(query, "CATEGORY ADDED SUCCESSFULLY");
    }

    public static ArrayList<Category> getAllRecords() {
        ArrayList<Category> arrayList = new ArrayList<>();
        try {
            ResultSet rs = dbop.getData("SELECT * FROM category");
            while (rs.next()) {
                Category category = new Category();
                category.setId(rs.getInt("id"));
                category.setName(rs.getString("name"));
                arrayList.add(category); // Add the category object to the list
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;

    }

    public static void delete(String id) {
        String query = "DELETE from category where id='" + id + "'";
        dbop.setDataorDelete(query, "CATEGORY DELETED");
    }
}
