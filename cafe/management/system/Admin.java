/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cafe.management.system;

import dao.RunQuery;
import javax.swing.JOptionPane;

/**
 *
 * @author ASADULLAH
 */
public class Admin {

    public void AddProduct(int Category, String Name, int ProductPrice, int stock) {
        try {
            String query = "INSERT INTO Product (CategoryID,name,price,stock) VALUES ('" + Category + "','" + Name + "','" + ProductPrice + "','" + stock + "');";
            RunQuery.runQuery(query, "Product Added Successfully.");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Enter Integer value for Required field.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public void EditProduct(int productid, String Name, int ProductPrice, int stock) {
        try {
            String query = "Update Product set Name='" + Name + "',Price='" + ProductPrice + "',Stock='" + stock + "'where itemId='" + productid + "';";
            RunQuery.runQuery(query, "Product Updated Successfully.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Enter Integer value for Required field.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void createCat(String Name, String Desc) {
        if (Name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter Complete Details.");
        } else {
            try {
                String query = "INSERT INTO Category(catname,catdesc) VALUES ('" + Name + "','" + Desc + "');";
                RunQuery.runQuery(query, "Category Created Successsfully");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }

    public void updateOrderStatus(int id, String status) {
        System.out.print(id);
        try {
            String query = "Update Orders set status='" + status + "' where orderid ='" + id + "' ;";
            RunQuery.runQuery(query, "Status Successsfully Updated.");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Enter Integer value for Required field.");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

//
//    public void manageCategory() {
//    }
//
//    public void manageProducts() {
//    }
//
//    public void manageOrders() {
//    }
}
