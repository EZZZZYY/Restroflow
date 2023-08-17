/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import MODEL.ORDERBILL;
import MODEL.Product;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class orderbilldata {

    public static String getId() {
        int id = 1;
        try {
            ResultSet rs = dbop.getData("SELECT max(id) from bill");
            if (rs.next()) {
                id = rs.getInt(1);
                id = id + 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }

    public static void save(ORDERBILL bill) {
        String query = "INSERT into bill values('" + bill.getId() + "','" + bill.getName() + "','" + bill.getMobileNumber() + "','" + bill.getAddress() + "','" + bill.getDate() + "','" + bill.getTotal() + "','" + bill.getCreatedBy() + "')";
        dbop.setDataorDelete(query, "BILL DETAILS ADDED");
    }
    public static ArrayList<ORDERBILL> getAllRecordsByInc(String date){
        ArrayList<ORDERBILL> arrayList =new ArrayList<>();
        try{
            ResultSet rs =dbop.getData("SELECT *from bill where date like '%'+date+'%'");
            while(rs.next()){
                ORDERBILL bill=new ORDERBILL();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setMobileNumber(rs.getString("phoneNumber"));
                bill.setAddress(rs.getString("address"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                bill.setCreatedBy(rs.getString("createdBy"));
                arrayList.add(bill);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
        public static ArrayList<ORDERBILL> getAllRecordsByDes(String date){
        ArrayList<ORDERBILL> arrayList =new ArrayList<>();
        try{
            ResultSet rs = dbop.getData("SELECT * FROM bill WHERE date LIKE '%" + date + "%' ORDER BY id DESC");
            while(rs.next()){
                    ORDERBILL bill=new ORDERBILL();
                bill.setId(rs.getInt("id"));
                bill.setName(rs.getString("name"));
                bill.setMobileNumber(rs.getString("mobileNumber"));
                bill.setAddress(rs.getString("address"));
                bill.setDate(rs.getString("date"));
                bill.setTotal(rs.getString("total"));
                bill.setCreatedBy(rs.getString("createdBy"));
                arrayList.add(bill);
            }
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

}
