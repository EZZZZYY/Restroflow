/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import MODEL.Product;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;

public class productdata {

    public static void save(Product product) {
        String query = "INSERT INTO product(name,category,price) values('" + product.getName() + "','" + product.getCategory() + "','" + product.getPrice() + "')";
        dbop.setDataorDelete(query, "PRODUCT ADDED SUCCESSFULLY");
    }

    public static ArrayList<Product> getAllRecords() {
        ArrayList<Product> arrayList = new ArrayList<>();
        try {
            ResultSet rs = dbop.getData("SELECT * FROM product");
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getInt("id"));
                product.setName(rs.getString("name"));
                product.setCategory(rs.getString("category"));
                product.setPrice(rs.getString("price"));
                arrayList.add(product);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return arrayList;
    }

    public static void update(Product product) {
        String query = "UPDATE product SET name='" + product.getName() + "', category='" + product.getCategory() + "', price='" + product.getPrice() + "' WHERE id='" + product.getId() + "'";
        dbop.setDataorDelete(query, "PRODUCT UPDATED SUCCESSFULLY");
    }

    public static void delete(String id) {
        String query = "DELETE FROM product WHERE id='" + id + "'";
        dbop.setDataorDelete(query, "PRODUCT DELETED SUCCESSFULLY");
    }

    public static ArrayList<Product> filterProductByname(String name, String category) {
        ArrayList<Product> arrayList = new ArrayList<>();
        try {
            ResultSet rs = dbop.getData("SELECT * FROM product WHERE name LIKE '%" + name + "' AND category = '" + category + "'");

            while (rs.next()) {
                Product product = new Product();
                product.setName(rs.getString("name"));
                arrayList.add(product);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static ArrayList<Product> getAllRecordsByCategory(String category) {
        ArrayList<Product> arrayList = new ArrayList<>();
        try {
            ResultSet rs = dbop.getData("SELECT * from product where category='" + category + "'");

            while (rs.next()) {
                Product product = new Product();
                product.setName(rs.getString("name"));
                arrayList.add(product);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static Product getProductByName(String name) {
        Product product = new Product();
        try {
            ResultSet rs = dbop.getData("SELECT * FROM product WHERE name='" + name + "'");
            if (rs.next()) { // Check if there is a row in the result set
                product.setName(rs.getString("name"));
                product.setCategory(rs.getString("category"));
                product.setPrice(rs.getString("price"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return product;
    }

}
